package mall.mapper.mall;

import java.util.List;
import mall.entity.mall.MallUser;
import mall.entity.mall.MallUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MallUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int countByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int deleteByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int insert(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int insertSelective(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    List<MallUser> selectByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    MallUser selectByPrimaryKey(Integer id);

    MallUser selectByUserName(String name);

    MallUser selectByOpenId(String openId);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MallUser record, @Param("example") MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MallUser record, @Param("example") MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MallUser record);
}