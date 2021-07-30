package mall.service.mall;

import mall.entity.mall.MallCart;
import mall.entity.mall.MallCartExample;
import mall.mapper.mall.MallCartMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author elmer
 * @date 2021/7/30 15:57
 */
@Service
public class MallCartService {
    @Resource
    MallCartMapper cartMapper;

    public int updateCheck(Integer userId, List<Integer> idsList, Boolean checked) {
        MallCartExample example = new MallCartExample();
        example.or().andUserIdEqualTo(userId).andProductIdIn(idsList).andDeletedEqualTo(false);
        MallCart cart = new MallCart();
        cart.setChecked(checked);
        cart.setUpdateTime(new Date());
        return cartMapper.updateByExampleSelective(cart, example);
    }

    public int delete(List<Integer> productIdList, int userId) {
        MallCartExample example = new MallCartExample();
        example.or().andUserIdEqualTo(userId).andProductIdIn(productIdList);
        return cartMapper.deleteByExample(example);
    }

    public List<MallCart> queryByUidAndChecked(Integer userId) {
        MallCartExample example = new MallCartExample();
        example.or().andUserIdEqualTo(userId).andCheckedEqualTo(true).andDeletedEqualTo(false);
        return cartMapper.selectByExample(example);
    }
}
