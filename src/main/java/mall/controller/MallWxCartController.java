package mall.controller;

import mall.base.*;
import mall.entity.mall.MallAddress;
import mall.entity.mall.MallCart;
import mall.entity.mall.MallGoods;
import mall.entity.mall.MallGoodsProduct;
import mall.mapper.mall.MallCartMapper;
import mall.mapper.mall.MallGoodsMapper;
import mall.mapper.mall.MallGoodsProductMapper;
import mall.service.mall.MallAddressService;
import mall.service.mall.MallCartService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author elmer
 * @date 2021/7/29 16:07
 */
@RestController
@Validated
public class MallWxCartController {

    @Resource
    MallCartMapper cartMapper;

    @Resource
    MallGoodsMapper goodsMapper;

    @Resource
    MallGoodsProductMapper productMapper;

    @Resource
    MallCartService cartService;

    @Resource
    MallAddressService addressService;

    @RequestMapping("cartGoodsCount")
    public Object cartGoodsCount(@LoginUser Integer userId) {
        if (userId == null) {// 如果用户未登录，则直接显示购物商品数量为0
            return ResponseUtil.ok(0);
        }
        int goodsCount = 0;
        try {
            List<MallCart> cartList = cartMapper.getAllByUserId(userId);
            for (MallCart cart : cartList) {
                goodsCount += cart.getNumber();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseUtil.ok(goodsCount);
    }

    @RequestMapping("cartIndex")
    public Object cartIndex(@LoginUser Integer userId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        List<MallCart> cartList = cartMapper.getAllByUserId(userId);
        Integer goodsCount = 0;
        BigDecimal goodsAmount = new BigDecimal(0.00);
        Integer checkedGoodsCount = 0;
        BigDecimal checkedGoodsAmount = new BigDecimal(0.00);
        for (MallCart cart : cartList) {
            goodsCount += cart.getNumber();
            goodsAmount = goodsAmount.add(cart.getPrice().multiply(new BigDecimal(cart.getNumber())));
            if (cart.getChecked()) {
                checkedGoodsCount += cart.getNumber();
                checkedGoodsAmount = checkedGoodsAmount.add(cart.getPrice().multiply(new BigDecimal(cart.getNumber())));
            }
        }
        Map<String, Object> cartTotal = new HashMap<>();
        cartTotal.put("goodsCount", goodsCount);
        cartTotal.put("goodsAmount", goodsAmount);
        cartTotal.put("checkedGoodsCount", checkedGoodsCount);
        cartTotal.put("checkedGoodsAmount", checkedGoodsAmount);
        Map<String, Object> result = new HashMap<>();
        result.put("cartTotal", cartTotal);
        result.put("isMultiOrderModel", 0);
        result.put("cartList", cartList);
        return ResponseUtil.ok(result);
    }

    @RequestMapping("cartAdd")
    public Object cartAdd(@LoginUser Integer userId,@RequestBody MallCart cart) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }	if (cart == null) {
            return ResponseUtil.badArgument();
        }
//        Integer productId = cart.getProductId();
        Integer productId = 283224;
        Integer number = cart.getNumber().intValue();
        Integer goodsId = cart.getGoodsId();
        if (!ObjectUtils.allNotNull(productId, number, goodsId)) {
            return ResponseUtil.badArgument();
        }// 判断商品是否可以购买
        MallGoods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null || !goods.getIsOnSale()) {
            return ResponseUtil.fail();
        }

        MallGoodsProduct product = productMapper.selectByPrimaryKey(productId);
        // 判断购物车中是否存在此规格商品
        MallCart existCart = cartMapper.queryExist(userId, goodsId, productId);
        if (existCart == null) {
            // 取得规格的信息,判断规格库存
            if (product == null || number > product.getNumber()) {
                return ResponseUtil.fail();
            }
            cart.setId(null);
            cart.setGoodsSn(goods.getGoodsSn());
            cart.setBrandId(goods.getBrandId());// 新增入驻商户
            cart.setGoodsName((goods.getName()));
            cart.setPicUrl(goods.getPicUrl());
            cart.setPrice(product.getPrice());
            cart.setSpecifications(product.getSpecifications());
            cart.setUserId(userId);
            cart.setChecked(true);
            cartMapper.insert(cart);
        } else {
            // 取得规格的信息,判断规格库存
            int num = existCart.getNumber() + number;
            if (num > product.getNumber()) {
                return WxResponseUtil.fail(WxResponseCode.GOODS_NO_STOCK);
            }
            existCart.setNumber((short) num);
            if (cartMapper.updateByPrimaryKey(existCart) == 0) {
                return ResponseUtil.updatedDataFailed();
            }
        }
        return cartGoodsCount(userId);
    }

    @RequestMapping("cartChecked")
    public Object checked(@LoginUser Integer userId, @RequestBody String body) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        if (body == null) {
            return ResponseUtil.badArgument();
        }

        List<Integer> productIds = JacksonUtil.parseIntegerList(body, "productIds");
        if (productIds == null) {
            return ResponseUtil.badArgument();
        }

        Integer checkValue = JacksonUtil.parseInteger(body, "isChecked");
        if (checkValue == null) {
            return ResponseUtil.badArgument();
        }
        boolean isChecked = (checkValue == 1);
        try {
            cartService.updateCheck(userId, productIds, isChecked);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartIndex(userId);
    }

    @RequestMapping("cartDelete")
    public Object cartDelete(@LoginUser Integer userId, @RequestBody String body) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }

        if (body == null) {
            return ResponseUtil.badArgument();
        }

        List<Integer> productIds = JacksonUtil.parseIntegerList(body, "productIds");

        if (productIds == null || productIds.size() == 0) {
            return ResponseUtil.badArgument();
        }

        try {
            cartService.delete(productIds, userId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cartIndex(userId);
    }

    @RequestMapping("cartUpdate")
    public Object cartUpdate(@LoginUser Integer userId, @RequestBody MallCart cart) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        if (cart == null) {
            return ResponseUtil.badArgument();
        }
        Integer productId = cart.getProductId();
        Integer number = cart.getNumber().intValue();
        Integer goodsId = cart.getGoodsId();
        Integer id = cart.getId();
        if (!ObjectUtils.allNotNull(id, productId, number, goodsId)) {
            return ResponseUtil.badArgument();
        }

        // 判断是否存在该订单
        // 如果不存在，直接返回错误
        MallCart existCart = cartMapper.selectByPrimaryKey(id);
        if (existCart == null) {
            return ResponseUtil.badArgumentValue();
        }
        // 判断goodsId和productId是否与当前cart里的值一致
        if (!existCart.getGoodsId().equals(goodsId)) {
            return ResponseUtil.badArgumentValue();
        }
        if (!existCart.getProductId().equals(productId)) {
            return ResponseUtil.badArgumentValue();
        }
        // 判断商品是否可以购买
        MallGoods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null || !goods.getIsOnSale()) {
            return WxResponseUtil.fail(WxResponseCode.GOODS_UNSHELVE);
        }

        // 取得规格的信息,判断规格库存
        MallGoodsProduct product = productMapper.selectByPrimaryKey(productId);
        if (product == null || product.getNumber() < number) {
            return WxResponseUtil.fail(WxResponseCode.GOODS_NO_STOCK);
        }

        existCart.setNumber(number.shortValue());
        if (cartMapper.updateByPrimaryKey(existCart) == 0) {
            return ResponseUtil.updatedDataFailed();
        }
        return ResponseUtil.ok();
    }

    @RequestMapping("cartFastAdd")
    public Object cartFastAdd(@LoginUser Integer userId, @RequestBody MallCart cart) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        if (cart == null) {
            return ResponseUtil.badArgument();
        }
        Integer productId = cart.getProductId();
        Integer number = cart.getNumber().intValue();
        Integer goodsId = cart.getGoodsId();
        if (!ObjectUtils.allNotNull(productId, number, goodsId)) {
            return ResponseUtil.badArgument();
        }
        // 判断商品是否可以购买
        MallGoods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null || !goods.getIsOnSale()) {
            return WxResponseUtil.fail(WxResponseCode.GOODS_UNSHELVE);
        }

        MallGoodsProduct product = productMapper.selectByPrimaryKey(productId);
        // 判断购物车中是否存在此规格商品
        MallCart existCart = cartMapper.queryExist(userId, goodsId, productId);
        if (existCart == null) {
            // 取得规格的信息,判断规格库存
            if (product == null || number > product.getNumber()) {
                return WxResponseUtil.fail(WxResponseCode.GOODS_NO_STOCK);
            }
            cart.setId(null);
            cart.setGoodsSn(goods.getGoodsSn());
            cart.setBrandId(goods.getBrandId());// 新增入驻商户
            cart.setGoodsName((goods.getName()));
            cart.setPicUrl(goods.getPicUrl());
            cart.setPrice(product.getPrice());
            cart.setSpecifications(product.getSpecifications());
            cart.setUserId(userId);
            cart.setChecked(true);
            cartMapper.insert(cart);
        } else {
            // 取得规格的信息,判断规格库存
            int num = number;
            if (num > product.getNumber()) {
                return WxResponseUtil.fail(WxResponseCode.GOODS_NO_STOCK);
            }
            existCart.setNumber((short) num);
            if (cartMapper.updateByPrimaryKey(existCart) == 0) {
                return ResponseUtil.updatedDataFailed();
            }
        }
        return ResponseUtil.ok(existCart != null ? existCart.getId() : cart.getId());
    }

    /**
     * 购物车下单
     *
     * @param userId
     *            用户ID
     * @param cartId
     *            购物车商品ID： 如果购物车商品ID是空，则下单当前用户所有购物车商品； 如果购物车商品ID非空，则只下单当前购物车商品。
     * @param addressId
     *            收货地址ID： 如果收货地址ID是空，则查询当前用户的默认地址。
     * @param couponId
     *            优惠券ID： 如果优惠券ID是空，则自动选择合适的优惠券。
     * @return 购物车操作结果
     */
    @RequestMapping("cartCheckOut")
    public Object checkout(@LoginUser Integer userId, Integer cartId, Integer addressId, Integer couponId,
                           Integer grouponRulesId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        // 收货地址
        MallAddress checkedAddress = null;
        if (addressId == null || addressId.equals(0)) {
            checkedAddress = addressService.findDefault(userId);
            // 如果仍然没有地址，则是没有收获地址
            // 返回一个空的地址id=0，这样前端则会提醒添加地址
            if (checkedAddress == null) {
                checkedAddress = new MallAddress();
                checkedAddress.setId(0);
                addressId = 0;
            } else {
                addressId = checkedAddress.getId();
            }

        } else {
            checkedAddress = addressService.findById(addressId);
            // 如果null, 则报错
            if (checkedAddress == null) {
                return ResponseUtil.badArgumentValue();
            }
        }

        // 团购优惠,如果是团购下单，只能单次购买一个商品，因为是从快速下单触发而来的。
//        BigDecimal grouponPrice = new BigDecimal(0.00);
//        DtsGrouponRules grouponRules = grouponRulesService.queryById(grouponRulesId);
//        if (grouponRules != null) {
//            grouponPrice = grouponRules.getDiscount();
//        }

        // 商品价格
        List<MallCart> checkedGoodsList = null;
        if (cartId == null || cartId.equals(0)) {// 如果未从购物车发起的下单，则获取用户选好的商品
            checkedGoodsList = cartService.queryByUidAndChecked(userId);
        } else {
            MallCart cart = cartMapper.selectByPrimaryKey(cartId);
            if (cart == null) {
                return ResponseUtil.badArgumentValue();
            }
            checkedGoodsList = new ArrayList<>(1);
            checkedGoodsList.add(cart);
        }

        Map<String, Object> data = new HashMap<>();

        BigDecimal goodsTotalPrice = new BigDecimal(0.00);// 商品总价 （包含团购减免，即减免团购后的商品总价，多店铺需将所有商品相加）
        BigDecimal totalFreightPrice = new BigDecimal(0.00);// 总配送费 （单店铺模式一个，多店铺模式多个配送费的总和）

        for (MallCart cart : checkedGoodsList) {
            // 只有当团购规格商品ID符合才进行团购优惠
//            if (grouponRules != null && grouponRules.getGoodsId().equals(cart.getGoodsId())) {
//                goodsTotalPrice = goodsTotalPrice
//                        .add(cart.getPrice().subtract(grouponPrice).multiply(new BigDecimal(cart.getNumber())));
//            } else {
//                goodsTotalPrice = goodsTotalPrice.add(cart.getPrice().multiply(new BigDecimal(cart.getNumber())));
//            }
            goodsTotalPrice = goodsTotalPrice.add(cart.getPrice().multiply(new BigDecimal(cart.getNumber())));
        }

        // 根据订单商品总价计算运费，满66则免运费，否则6元；
        if (goodsTotalPrice.compareTo(new BigDecimal(88)) < 0) {
            totalFreightPrice = new BigDecimal(6);
        }

        data.put("isMultiOrderModel", 0);
        data.put("goodsTotalPrice", goodsTotalPrice);
        data.put("freightPrice", totalFreightPrice);

        data.put("checkedGoodsList", checkedGoodsList);

        // 计算优惠券可用情况
        BigDecimal tmpCouponPrice = new BigDecimal(0.00);
        Integer tmpCouponId = 0;
        int tmpCouponLength = 0;
//        List<DtsCouponUser> couponUserList = couponUserService.queryAll(userId);
//        for (DtsCouponUser couponUser : couponUserList) {
//            DtsCoupon coupon = couponVerifyService.checkCoupon(userId, couponUser.getCouponId(), goodsTotalPrice);
//            if (coupon == null) {
//                continue;
//            }
//            tmpCouponLength++;
//            if (tmpCouponPrice.compareTo(coupon.getDiscount()) == -1) {
//                tmpCouponPrice = coupon.getDiscount();
//                tmpCouponId = coupon.getId();
//            }
//        }
        // 获取优惠券减免金额，优惠券可用数量
        int availableCouponLength = tmpCouponLength;
        BigDecimal couponPrice = new BigDecimal(0);

        /**
         * 这里存在三种情况: 1. 用户不想使用优惠券，则不处理 2. 用户想自动使用优惠券，则选择合适优惠券 3. 用户已选择优惠券，则测试优惠券是否合适
         */
        if (couponId == null || couponId.equals(-1)) { // 1. 用户不想使用优惠券，则不处理
            couponId = -1;
        } else if (couponId.equals(0)) { // 2. 用户想自动使用优惠券，则选择合适优惠券
            couponPrice = tmpCouponPrice;
            couponId = tmpCouponId;
        } else { // 3. 用户已选择优惠券，则测试优惠券是否合适 ，购买商品总价（有团购商品需按团购商品后的价格计算）要超出券的最低消费金额
//            DtsCoupon coupon = couponVerifyService.checkCoupon(userId, couponId, goodsTotalPrice);
//            // 用户选择的优惠券有问题
//            if (coupon == null) {
//                logger.error("用户购物车下单失败:{}", INVALID_COUPON.desc());
//                return WxResponseUtil.fail(INVALID_COUPON);
//            }
//            couponPrice = coupon.getDiscount();
        }

        // 用户积分减免
        BigDecimal integralPrice = new BigDecimal(0.00);

        BigDecimal orderTotalPrice = goodsTotalPrice.add(totalFreightPrice).subtract(couponPrice);
        BigDecimal actualPrice = orderTotalPrice.subtract(integralPrice);

        // 返回界面的通用数据
        data.put("addressId", addressId);
        data.put("checkedAddress", checkedAddress);
        data.put("couponId", couponId);
        data.put("availableCouponLength", availableCouponLength);
        data.put("grouponRulesId", grouponRulesId);

//        data.put("grouponPrice", grouponPrice);// 团购优惠的商品价格（团购商品需减免的优惠金额）
        data.put("couponPrice", couponPrice);// 单店铺，多店铺 一个总订单都只能用一张券

        data.put("orderTotalPrice", orderTotalPrice);// 订单总价：goodsTotalPrice + totalFreightPrice - couponPrice
        data.put("actualPrice", actualPrice);// 订单实际付款金额：orderTotalPrice - integralPrice

        return ResponseUtil.ok(data);
    }


}
