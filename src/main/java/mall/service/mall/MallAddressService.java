package mall.service.mall;

import mall.entity.mall.MallAddress;
import mall.entity.mall.MallAddressExample;
import mall.mapper.mall.MallAddressMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author elmer
 * @date 2021/7/30 17:09
 */
@Service
public class MallAddressService {

    @Resource
    MallAddressMapper addressMapper;

    public MallAddress findDefault(Integer userId) {
        MallAddressExample example = new MallAddressExample();
        example.or().andUserIdEqualTo(userId).andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }

    public MallAddress findById(Integer id) {
        return addressMapper.selectByPrimaryKey(id);
    }
}
