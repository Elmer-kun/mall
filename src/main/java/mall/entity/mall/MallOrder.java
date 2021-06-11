package mall.entity.mall;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.order_sn
     *
     * @mbggenerated
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.order_status
     *
     * @mbggenerated
     */
    private Short orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.consignee
     *
     * @mbggenerated
     */
    private String consignee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.message
     *
     * @mbggenerated
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.goods_price
     *
     * @mbggenerated
     */
    private BigDecimal goodsPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.freight_price
     *
     * @mbggenerated
     */
    private BigDecimal freightPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.coupon_price
     *
     * @mbggenerated
     */
    private BigDecimal couponPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.integral_price
     *
     * @mbggenerated
     */
    private BigDecimal integralPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.groupon_price
     *
     * @mbggenerated
     */
    private BigDecimal grouponPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.order_price
     *
     * @mbggenerated
     */
    private BigDecimal orderPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.actual_price
     *
     * @mbggenerated
     */
    private BigDecimal actualPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.pay_id
     *
     * @mbggenerated
     */
    private String payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.pay_time
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.ship_sn
     *
     * @mbggenerated
     */
    private String shipSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.ship_channel
     *
     * @mbggenerated
     */
    private String shipChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.ship_time
     *
     * @mbggenerated
     */
    private Date shipTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.confirm_time
     *
     * @mbggenerated
     */
    private Date confirmTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.comments
     *
     * @mbggenerated
     */
    private Short comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.add_time
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.settlement_money
     *
     * @mbggenerated
     */
    private BigDecimal settlementMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.settlement_status
     *
     * @mbggenerated
     */
    private Boolean settlementStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.freight_type
     *
     * @mbggenerated
     */
    private Byte freightType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.share_user_id
     *
     * @mbggenerated
     */
    private Integer shareUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.fetch_code
     *
     * @mbggenerated
     */
    private String fetchCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.create_user_id
     *
     * @mbggenerated
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.gift_send_time
     *
     * @mbggenerated
     */
    private Date giftSendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_order.gift_receive_time
     *
     * @mbggenerated
     */
    private Date giftReceiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mall_order
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.id
     *
     * @return the value of mall_order.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.id
     *
     * @param id the value for mall_order.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.user_id
     *
     * @return the value of mall_order.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.user_id
     *
     * @param userId the value for mall_order.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.order_sn
     *
     * @return the value of mall_order.order_sn
     *
     * @mbggenerated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.order_sn
     *
     * @param orderSn the value for mall_order.order_sn
     *
     * @mbggenerated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.order_status
     *
     * @return the value of mall_order.order_status
     *
     * @mbggenerated
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.order_status
     *
     * @param orderStatus the value for mall_order.order_status
     *
     * @mbggenerated
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.consignee
     *
     * @return the value of mall_order.consignee
     *
     * @mbggenerated
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.consignee
     *
     * @param consignee the value for mall_order.consignee
     *
     * @mbggenerated
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.mobile
     *
     * @return the value of mall_order.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.mobile
     *
     * @param mobile the value for mall_order.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.address
     *
     * @return the value of mall_order.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.address
     *
     * @param address the value for mall_order.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.message
     *
     * @return the value of mall_order.message
     *
     * @mbggenerated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.message
     *
     * @param message the value for mall_order.message
     *
     * @mbggenerated
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.goods_price
     *
     * @return the value of mall_order.goods_price
     *
     * @mbggenerated
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.goods_price
     *
     * @param goodsPrice the value for mall_order.goods_price
     *
     * @mbggenerated
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.freight_price
     *
     * @return the value of mall_order.freight_price
     *
     * @mbggenerated
     */
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.freight_price
     *
     * @param freightPrice the value for mall_order.freight_price
     *
     * @mbggenerated
     */
    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.coupon_price
     *
     * @return the value of mall_order.coupon_price
     *
     * @mbggenerated
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.coupon_price
     *
     * @param couponPrice the value for mall_order.coupon_price
     *
     * @mbggenerated
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.integral_price
     *
     * @return the value of mall_order.integral_price
     *
     * @mbggenerated
     */
    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.integral_price
     *
     * @param integralPrice the value for mall_order.integral_price
     *
     * @mbggenerated
     */
    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.groupon_price
     *
     * @return the value of mall_order.groupon_price
     *
     * @mbggenerated
     */
    public BigDecimal getGrouponPrice() {
        return grouponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.groupon_price
     *
     * @param grouponPrice the value for mall_order.groupon_price
     *
     * @mbggenerated
     */
    public void setGrouponPrice(BigDecimal grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.order_price
     *
     * @return the value of mall_order.order_price
     *
     * @mbggenerated
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.order_price
     *
     * @param orderPrice the value for mall_order.order_price
     *
     * @mbggenerated
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.actual_price
     *
     * @return the value of mall_order.actual_price
     *
     * @mbggenerated
     */
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.actual_price
     *
     * @param actualPrice the value for mall_order.actual_price
     *
     * @mbggenerated
     */
    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.pay_id
     *
     * @return the value of mall_order.pay_id
     *
     * @mbggenerated
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.pay_id
     *
     * @param payId the value for mall_order.pay_id
     *
     * @mbggenerated
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.pay_time
     *
     * @return the value of mall_order.pay_time
     *
     * @mbggenerated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.pay_time
     *
     * @param payTime the value for mall_order.pay_time
     *
     * @mbggenerated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.ship_sn
     *
     * @return the value of mall_order.ship_sn
     *
     * @mbggenerated
     */
    public String getShipSn() {
        return shipSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.ship_sn
     *
     * @param shipSn the value for mall_order.ship_sn
     *
     * @mbggenerated
     */
    public void setShipSn(String shipSn) {
        this.shipSn = shipSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.ship_channel
     *
     * @return the value of mall_order.ship_channel
     *
     * @mbggenerated
     */
    public String getShipChannel() {
        return shipChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.ship_channel
     *
     * @param shipChannel the value for mall_order.ship_channel
     *
     * @mbggenerated
     */
    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.ship_time
     *
     * @return the value of mall_order.ship_time
     *
     * @mbggenerated
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.ship_time
     *
     * @param shipTime the value for mall_order.ship_time
     *
     * @mbggenerated
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.confirm_time
     *
     * @return the value of mall_order.confirm_time
     *
     * @mbggenerated
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.confirm_time
     *
     * @param confirmTime the value for mall_order.confirm_time
     *
     * @mbggenerated
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.comments
     *
     * @return the value of mall_order.comments
     *
     * @mbggenerated
     */
    public Short getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.comments
     *
     * @param comments the value for mall_order.comments
     *
     * @mbggenerated
     */
    public void setComments(Short comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.end_time
     *
     * @return the value of mall_order.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.end_time
     *
     * @param endTime the value for mall_order.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.add_time
     *
     * @return the value of mall_order.add_time
     *
     * @mbggenerated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.add_time
     *
     * @param addTime the value for mall_order.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.update_time
     *
     * @return the value of mall_order.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.update_time
     *
     * @param updateTime the value for mall_order.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.deleted
     *
     * @return the value of mall_order.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.deleted
     *
     * @param deleted the value for mall_order.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.settlement_money
     *
     * @return the value of mall_order.settlement_money
     *
     * @mbggenerated
     */
    public BigDecimal getSettlementMoney() {
        return settlementMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.settlement_money
     *
     * @param settlementMoney the value for mall_order.settlement_money
     *
     * @mbggenerated
     */
    public void setSettlementMoney(BigDecimal settlementMoney) {
        this.settlementMoney = settlementMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.settlement_status
     *
     * @return the value of mall_order.settlement_status
     *
     * @mbggenerated
     */
    public Boolean getSettlementStatus() {
        return settlementStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.settlement_status
     *
     * @param settlementStatus the value for mall_order.settlement_status
     *
     * @mbggenerated
     */
    public void setSettlementStatus(Boolean settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.freight_type
     *
     * @return the value of mall_order.freight_type
     *
     * @mbggenerated
     */
    public Byte getFreightType() {
        return freightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.freight_type
     *
     * @param freightType the value for mall_order.freight_type
     *
     * @mbggenerated
     */
    public void setFreightType(Byte freightType) {
        this.freightType = freightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.share_user_id
     *
     * @return the value of mall_order.share_user_id
     *
     * @mbggenerated
     */
    public Integer getShareUserId() {
        return shareUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.share_user_id
     *
     * @param shareUserId the value for mall_order.share_user_id
     *
     * @mbggenerated
     */
    public void setShareUserId(Integer shareUserId) {
        this.shareUserId = shareUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.fetch_code
     *
     * @return the value of mall_order.fetch_code
     *
     * @mbggenerated
     */
    public String getFetchCode() {
        return fetchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.fetch_code
     *
     * @param fetchCode the value for mall_order.fetch_code
     *
     * @mbggenerated
     */
    public void setFetchCode(String fetchCode) {
        this.fetchCode = fetchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.create_user_id
     *
     * @return the value of mall_order.create_user_id
     *
     * @mbggenerated
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.create_user_id
     *
     * @param createUserId the value for mall_order.create_user_id
     *
     * @mbggenerated
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.gift_send_time
     *
     * @return the value of mall_order.gift_send_time
     *
     * @mbggenerated
     */
    public Date getGiftSendTime() {
        return giftSendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.gift_send_time
     *
     * @param giftSendTime the value for mall_order.gift_send_time
     *
     * @mbggenerated
     */
    public void setGiftSendTime(Date giftSendTime) {
        this.giftSendTime = giftSendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_order.gift_receive_time
     *
     * @return the value of mall_order.gift_receive_time
     *
     * @mbggenerated
     */
    public Date getGiftReceiveTime() {
        return giftReceiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_order.gift_receive_time
     *
     * @param giftReceiveTime the value for mall_order.gift_receive_time
     *
     * @mbggenerated
     */
    public void setGiftReceiveTime(Date giftReceiveTime) {
        this.giftReceiveTime = giftReceiveTime;
    }
}