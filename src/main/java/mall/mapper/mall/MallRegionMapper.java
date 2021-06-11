package mall.mapper.mall;

import java.util.List;
import mall.entity.mall.MallRegion;
import mall.entity.mall.MallRegionExample;
import org.apache.ibatis.annotations.Param;

public interface MallRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int countByExample(MallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int deleteByExample(MallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int insert(MallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int insertSelective(MallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    List<MallRegion> selectByExample(MallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    MallRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MallRegion record, @Param("example") MallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MallRegion record, @Param("example") MallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_region
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MallRegion record);
}