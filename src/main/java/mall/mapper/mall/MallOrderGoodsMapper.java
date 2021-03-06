package mall.mapper.mall;

import java.util.List;
import mall.entity.mall.MallOrderGoods;
import mall.entity.mall.MallOrderGoodsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MallOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int countByExample(MallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int deleteByExample(MallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int insert(MallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int insertSelective(MallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    List<MallOrderGoods> selectByExample(MallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    MallOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MallOrderGoods record, @Param("example") MallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MallOrderGoods record, @Param("example") MallOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MallOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_order_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MallOrderGoods record);
}