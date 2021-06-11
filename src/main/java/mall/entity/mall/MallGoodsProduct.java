package mall.entity.mall;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallGoodsProduct implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.specifications
     *
     * @mbggenerated
     */
    private String specifications;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.number
     *
     * @mbggenerated
     */
    private Integer number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.add_time
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods_product.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mall_goods_product
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.id
     *
     * @return the value of mall_goods_product.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.id
     *
     * @param id the value for mall_goods_product.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.goods_id
     *
     * @return the value of mall_goods_product.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.goods_id
     *
     * @param goodsId the value for mall_goods_product.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.specifications
     *
     * @return the value of mall_goods_product.specifications
     *
     * @mbggenerated
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.specifications
     *
     * @param specifications the value for mall_goods_product.specifications
     *
     * @mbggenerated
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.price
     *
     * @return the value of mall_goods_product.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.price
     *
     * @param price the value for mall_goods_product.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.number
     *
     * @return the value of mall_goods_product.number
     *
     * @mbggenerated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.number
     *
     * @param number the value for mall_goods_product.number
     *
     * @mbggenerated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.url
     *
     * @return the value of mall_goods_product.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.url
     *
     * @param url the value for mall_goods_product.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.add_time
     *
     * @return the value of mall_goods_product.add_time
     *
     * @mbggenerated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.add_time
     *
     * @param addTime the value for mall_goods_product.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.update_time
     *
     * @return the value of mall_goods_product.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.update_time
     *
     * @param updateTime the value for mall_goods_product.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods_product.deleted
     *
     * @return the value of mall_goods_product.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods_product.deleted
     *
     * @param deleted the value for mall_goods_product.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}