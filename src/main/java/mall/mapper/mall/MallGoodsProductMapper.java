package mall.mapper.mall;

import java.util.List;
import mall.entity.mall.MallGoodsProduct;
import mall.entity.mall.MallGoodsProductExample;
import org.apache.ibatis.annotations.Param;

public interface MallGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int countByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int deleteByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int insert(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int insertSelective(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    List<MallGoodsProduct> selectByExample(MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    MallGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MallGoodsProduct record);
}