package mall.entity.mall;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallGoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.goods_sn
     *
     * @mbggenerated
     */
    private String goodsSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.category_id
     *
     * @mbggenerated
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.brand_id
     *
     * @mbggenerated
     */
    private Integer brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.gallery
     *
     * @mbggenerated
     */
    private String gallery;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.keywords
     *
     * @mbggenerated
     */
    private String keywords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.brief
     *
     * @mbggenerated
     */
    private String brief;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.is_on_sale
     *
     * @mbggenerated
     */
    private Boolean isOnSale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.sort_order
     *
     * @mbggenerated
     */
    private Short sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.pic_url
     *
     * @mbggenerated
     */
    private String picUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.share_url
     *
     * @mbggenerated
     */
    private String shareUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.is_new
     *
     * @mbggenerated
     */
    private Boolean isNew;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.is_hot
     *
     * @mbggenerated
     */
    private Boolean isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.unit
     *
     * @mbggenerated
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.counter_price
     *
     * @mbggenerated
     */
    private BigDecimal counterPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.retail_price
     *
     * @mbggenerated
     */
    private BigDecimal retailPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.add_time
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.browse
     *
     * @mbggenerated
     */
    private Integer browse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.sales
     *
     * @mbggenerated
     */
    private Integer sales;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.commpany
     *
     * @mbggenerated
     */
    private String commpany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.wholesale_price
     *
     * @mbggenerated
     */
    private BigDecimal wholesalePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.approve_status
     *
     * @mbggenerated
     */
    private Byte approveStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.approve_msg
     *
     * @mbggenerated
     */
    private String approveMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.brokerage_type
     *
     * @mbggenerated
     */
    private Byte brokerageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.brokerage_price
     *
     * @mbggenerated
     */
    private BigDecimal brokeragePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.detail
     *
     * @mbggenerated
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mall_goods
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.id
     *
     * @return the value of mall_goods.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.id
     *
     * @param id the value for mall_goods.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.goods_sn
     *
     * @return the value of mall_goods.goods_sn
     *
     * @mbggenerated
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.goods_sn
     *
     * @param goodsSn the value for mall_goods.goods_sn
     *
     * @mbggenerated
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.name
     *
     * @return the value of mall_goods.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.name
     *
     * @param name the value for mall_goods.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.category_id
     *
     * @return the value of mall_goods.category_id
     *
     * @mbggenerated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.category_id
     *
     * @param categoryId the value for mall_goods.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.brand_id
     *
     * @return the value of mall_goods.brand_id
     *
     * @mbggenerated
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.brand_id
     *
     * @param brandId the value for mall_goods.brand_id
     *
     * @mbggenerated
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.gallery
     *
     * @return the value of mall_goods.gallery
     *
     * @mbggenerated
     */
    public String getGallery() {
        return gallery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.gallery
     *
     * @param gallery the value for mall_goods.gallery
     *
     * @mbggenerated
     */
    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.keywords
     *
     * @return the value of mall_goods.keywords
     *
     * @mbggenerated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.keywords
     *
     * @param keywords the value for mall_goods.keywords
     *
     * @mbggenerated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.brief
     *
     * @return the value of mall_goods.brief
     *
     * @mbggenerated
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.brief
     *
     * @param brief the value for mall_goods.brief
     *
     * @mbggenerated
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.is_on_sale
     *
     * @return the value of mall_goods.is_on_sale
     *
     * @mbggenerated
     */
    public Boolean getIsOnSale() {
        return isOnSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.is_on_sale
     *
     * @param isOnSale the value for mall_goods.is_on_sale
     *
     * @mbggenerated
     */
    public void setIsOnSale(Boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.sort_order
     *
     * @return the value of mall_goods.sort_order
     *
     * @mbggenerated
     */
    public Short getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.sort_order
     *
     * @param sortOrder the value for mall_goods.sort_order
     *
     * @mbggenerated
     */
    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.pic_url
     *
     * @return the value of mall_goods.pic_url
     *
     * @mbggenerated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.pic_url
     *
     * @param picUrl the value for mall_goods.pic_url
     *
     * @mbggenerated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.share_url
     *
     * @return the value of mall_goods.share_url
     *
     * @mbggenerated
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.share_url
     *
     * @param shareUrl the value for mall_goods.share_url
     *
     * @mbggenerated
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.is_new
     *
     * @return the value of mall_goods.is_new
     *
     * @mbggenerated
     */
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.is_new
     *
     * @param isNew the value for mall_goods.is_new
     *
     * @mbggenerated
     */
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.is_hot
     *
     * @return the value of mall_goods.is_hot
     *
     * @mbggenerated
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.is_hot
     *
     * @param isHot the value for mall_goods.is_hot
     *
     * @mbggenerated
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.unit
     *
     * @return the value of mall_goods.unit
     *
     * @mbggenerated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.unit
     *
     * @param unit the value for mall_goods.unit
     *
     * @mbggenerated
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.counter_price
     *
     * @return the value of mall_goods.counter_price
     *
     * @mbggenerated
     */
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.counter_price
     *
     * @param counterPrice the value for mall_goods.counter_price
     *
     * @mbggenerated
     */
    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.retail_price
     *
     * @return the value of mall_goods.retail_price
     *
     * @mbggenerated
     */
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.retail_price
     *
     * @param retailPrice the value for mall_goods.retail_price
     *
     * @mbggenerated
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.add_time
     *
     * @return the value of mall_goods.add_time
     *
     * @mbggenerated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.add_time
     *
     * @param addTime the value for mall_goods.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.update_time
     *
     * @return the value of mall_goods.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.update_time
     *
     * @param updateTime the value for mall_goods.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.browse
     *
     * @return the value of mall_goods.browse
     *
     * @mbggenerated
     */
    public Integer getBrowse() {
        return browse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.browse
     *
     * @param browse the value for mall_goods.browse
     *
     * @mbggenerated
     */
    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.sales
     *
     * @return the value of mall_goods.sales
     *
     * @mbggenerated
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.sales
     *
     * @param sales the value for mall_goods.sales
     *
     * @mbggenerated
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.deleted
     *
     * @return the value of mall_goods.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.deleted
     *
     * @param deleted the value for mall_goods.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.commpany
     *
     * @return the value of mall_goods.commpany
     *
     * @mbggenerated
     */
    public String getCommpany() {
        return commpany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.commpany
     *
     * @param commpany the value for mall_goods.commpany
     *
     * @mbggenerated
     */
    public void setCommpany(String commpany) {
        this.commpany = commpany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.wholesale_price
     *
     * @return the value of mall_goods.wholesale_price
     *
     * @mbggenerated
     */
    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.wholesale_price
     *
     * @param wholesalePrice the value for mall_goods.wholesale_price
     *
     * @mbggenerated
     */
    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.approve_status
     *
     * @return the value of mall_goods.approve_status
     *
     * @mbggenerated
     */
    public Byte getApproveStatus() {
        return approveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.approve_status
     *
     * @param approveStatus the value for mall_goods.approve_status
     *
     * @mbggenerated
     */
    public void setApproveStatus(Byte approveStatus) {
        this.approveStatus = approveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.approve_msg
     *
     * @return the value of mall_goods.approve_msg
     *
     * @mbggenerated
     */
    public String getApproveMsg() {
        return approveMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.approve_msg
     *
     * @param approveMsg the value for mall_goods.approve_msg
     *
     * @mbggenerated
     */
    public void setApproveMsg(String approveMsg) {
        this.approveMsg = approveMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.brokerage_type
     *
     * @return the value of mall_goods.brokerage_type
     *
     * @mbggenerated
     */
    public Byte getBrokerageType() {
        return brokerageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.brokerage_type
     *
     * @param brokerageType the value for mall_goods.brokerage_type
     *
     * @mbggenerated
     */
    public void setBrokerageType(Byte brokerageType) {
        this.brokerageType = brokerageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.brokerage_price
     *
     * @return the value of mall_goods.brokerage_price
     *
     * @mbggenerated
     */
    public BigDecimal getBrokeragePrice() {
        return brokeragePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.brokerage_price
     *
     * @param brokeragePrice the value for mall_goods.brokerage_price
     *
     * @mbggenerated
     */
    public void setBrokeragePrice(BigDecimal brokeragePrice) {
        this.brokeragePrice = brokeragePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.detail
     *
     * @return the value of mall_goods.detail
     *
     * @mbggenerated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.detail
     *
     * @param detail the value for mall_goods.detail
     *
     * @mbggenerated
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}