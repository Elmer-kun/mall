package mall.mapper.mall;

import java.util.List;
import mall.entity.mall.MallCart;
import mall.entity.mall.MallCartExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MallCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int countByExample(MallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int deleteByExample(MallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int insert(MallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int insertSelective(MallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    List<MallCart> selectByExample(MallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    MallCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MallCart record, @Param("example") MallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MallCart record, @Param("example") MallCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_cart
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MallCart record);

    List<MallCart> getAll();

    List<MallCart> getAllByUserId(Integer userId);

    MallCart queryExist(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId, @Param("productId") Integer productId);
}