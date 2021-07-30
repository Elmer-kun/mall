package mall.entity.mall;

import java.io.Serializable;
import java.util.Date;

public class MallGoodsSpecification implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.specification
     *
     * @mbggenerated
     */
    private String specification;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.value
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.pic_url
     *
     * @mbggenerated
     */
    private String picUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.add_time
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_specification.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mall_goods_specification
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.id
     *
     * @return the value of mall_goods_specification.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.id
     *
     * @param id the value for mall_goods_specification.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.goods_id
     *
     * @return the value of mall_goods_specification.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.goods_id
     *
     * @param goodsId the value for mall_goods_specification.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.specification
     *
     * @return the value of mall_goods_specification.specification
     *
     * @mbggenerated
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.specification
     *
     * @param specification the value for mall_goods_specification.specification
     *
     * @mbggenerated
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.value
     *
     * @return the value of mall_goods_specification.value
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.value
     *
     * @param value the value for mall_goods_specification.value
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.pic_url
     *
     * @return the value of mall_goods_specification.pic_url
     *
     * @mbggenerated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.pic_url
     *
     * @param picUrl the value for mall_goods_specification.pic_url
     *
     * @mbggenerated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.add_time
     *
     * @return the value of mall_goods_specification.add_time
     *
     * @mbggenerated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.add_time
     *
     * @param addTime the value for mall_goods_specification.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.update_time
     *
     * @return the value of mall_goods_specification.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.update_time
     *
     * @param updateTime the value for mall_goods_specification.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_specification.deleted
     *
     * @return the value of mall_goods_specification.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_specification.deleted
     *
     * @param deleted the value for mall_goods_specification.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}