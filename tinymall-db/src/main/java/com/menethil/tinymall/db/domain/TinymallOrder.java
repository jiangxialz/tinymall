package com.menethil.tinymall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TinymallOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.order_status
     *
     * @mbg.generated
     */
    private Short orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.consignee
     *
     * @mbg.generated
     */
    private String consignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.goods_price
     *
     * @mbg.generated
     */
    private BigDecimal goodsPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.freight_price
     *
     * @mbg.generated
     */
    private BigDecimal freightPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.coupon_price
     *
     * @mbg.generated
     */
    private BigDecimal couponPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.integral_price
     *
     * @mbg.generated
     */
    private BigDecimal integralPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.order_price
     *
     * @mbg.generated
     */
    private BigDecimal orderPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.actual_price
     *
     * @mbg.generated
     */
    private BigDecimal actualPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.pay_id
     *
     * @mbg.generated
     */
    private String payId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.pay_time
     *
     * @mbg.generated
     */
    private LocalDateTime payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.ship_sn
     *
     * @mbg.generated
     */
    private String shipSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.ship_channel
     *
     * @mbg.generated
     */
    private String shipChannel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.ship_time
     *
     * @mbg.generated
     */
    private LocalDateTime shipTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.confirm_time
     *
     * @mbg.generated
     */
    private LocalDateTime confirmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.end_time
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tinymall_order.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.id
     *
     * @return the value of tinymall_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.id
     *
     * @param id the value for tinymall_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.user_id
     *
     * @return the value of tinymall_order.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.user_id
     *
     * @param userId the value for tinymall_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.order_sn
     *
     * @return the value of tinymall_order.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.order_sn
     *
     * @param orderSn the value for tinymall_order.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.order_status
     *
     * @return the value of tinymall_order.order_status
     *
     * @mbg.generated
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.order_status
     *
     * @param orderStatus the value for tinymall_order.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.consignee
     *
     * @return the value of tinymall_order.consignee
     *
     * @mbg.generated
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.consignee
     *
     * @param consignee the value for tinymall_order.consignee
     *
     * @mbg.generated
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.mobile
     *
     * @return the value of tinymall_order.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.mobile
     *
     * @param mobile the value for tinymall_order.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.address
     *
     * @return the value of tinymall_order.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.address
     *
     * @param address the value for tinymall_order.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.goods_price
     *
     * @return the value of tinymall_order.goods_price
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.goods_price
     *
     * @param goodsPrice the value for tinymall_order.goods_price
     *
     * @mbg.generated
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.freight_price
     *
     * @return the value of tinymall_order.freight_price
     *
     * @mbg.generated
     */
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.freight_price
     *
     * @param freightPrice the value for tinymall_order.freight_price
     *
     * @mbg.generated
     */
    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.coupon_price
     *
     * @return the value of tinymall_order.coupon_price
     *
     * @mbg.generated
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.coupon_price
     *
     * @param couponPrice the value for tinymall_order.coupon_price
     *
     * @mbg.generated
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.integral_price
     *
     * @return the value of tinymall_order.integral_price
     *
     * @mbg.generated
     */
    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.integral_price
     *
     * @param integralPrice the value for tinymall_order.integral_price
     *
     * @mbg.generated
     */
    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.order_price
     *
     * @return the value of tinymall_order.order_price
     *
     * @mbg.generated
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.order_price
     *
     * @param orderPrice the value for tinymall_order.order_price
     *
     * @mbg.generated
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.actual_price
     *
     * @return the value of tinymall_order.actual_price
     *
     * @mbg.generated
     */
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.actual_price
     *
     * @param actualPrice the value for tinymall_order.actual_price
     *
     * @mbg.generated
     */
    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.pay_id
     *
     * @return the value of tinymall_order.pay_id
     *
     * @mbg.generated
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.pay_id
     *
     * @param payId the value for tinymall_order.pay_id
     *
     * @mbg.generated
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.pay_time
     *
     * @return the value of tinymall_order.pay_time
     *
     * @mbg.generated
     */
    public LocalDateTime getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.pay_time
     *
     * @param payTime the value for tinymall_order.pay_time
     *
     * @mbg.generated
     */
    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.ship_sn
     *
     * @return the value of tinymall_order.ship_sn
     *
     * @mbg.generated
     */
    public String getShipSn() {
        return shipSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.ship_sn
     *
     * @param shipSn the value for tinymall_order.ship_sn
     *
     * @mbg.generated
     */
    public void setShipSn(String shipSn) {
        this.shipSn = shipSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.ship_channel
     *
     * @return the value of tinymall_order.ship_channel
     *
     * @mbg.generated
     */
    public String getShipChannel() {
        return shipChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.ship_channel
     *
     * @param shipChannel the value for tinymall_order.ship_channel
     *
     * @mbg.generated
     */
    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.ship_time
     *
     * @return the value of tinymall_order.ship_time
     *
     * @mbg.generated
     */
    public LocalDateTime getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.ship_time
     *
     * @param shipTime the value for tinymall_order.ship_time
     *
     * @mbg.generated
     */
    public void setShipTime(LocalDateTime shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.confirm_time
     *
     * @return the value of tinymall_order.confirm_time
     *
     * @mbg.generated
     */
    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.confirm_time
     *
     * @param confirmTime the value for tinymall_order.confirm_time
     *
     * @mbg.generated
     */
    public void setConfirmTime(LocalDateTime confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.end_time
     *
     * @return the value of tinymall_order.end_time
     *
     * @mbg.generated
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.end_time
     *
     * @param endTime the value for tinymall_order.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.add_time
     *
     * @return the value of tinymall_order.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.add_time
     *
     * @param addTime the value for tinymall_order.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tinymall_order.deleted
     *
     * @return the value of tinymall_order.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tinymall_order.deleted
     *
     * @param deleted the value for tinymall_order.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", consignee=").append(consignee);
        sb.append(", mobile=").append(mobile);
        sb.append(", address=").append(address);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", freightPrice=").append(freightPrice);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", integralPrice=").append(integralPrice);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", actualPrice=").append(actualPrice);
        sb.append(", payId=").append(payId);
        sb.append(", payTime=").append(payTime);
        sb.append(", shipSn=").append(shipSn);
        sb.append(", shipChannel=").append(shipChannel);
        sb.append(", shipTime=").append(shipTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", addTime=").append(addTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TinymallOrder other = (TinymallOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getConsignee() == null ? other.getConsignee() == null : this.getConsignee().equals(other.getConsignee()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getFreightPrice() == null ? other.getFreightPrice() == null : this.getFreightPrice().equals(other.getFreightPrice()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getIntegralPrice() == null ? other.getIntegralPrice() == null : this.getIntegralPrice().equals(other.getIntegralPrice()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getActualPrice() == null ? other.getActualPrice() == null : this.getActualPrice().equals(other.getActualPrice()))
            && (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getShipSn() == null ? other.getShipSn() == null : this.getShipSn().equals(other.getShipSn()))
            && (this.getShipChannel() == null ? other.getShipChannel() == null : this.getShipChannel().equals(other.getShipChannel()))
            && (this.getShipTime() == null ? other.getShipTime() == null : this.getShipTime().equals(other.getShipTime()))
            && (this.getConfirmTime() == null ? other.getConfirmTime() == null : this.getConfirmTime().equals(other.getConfirmTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getConsignee() == null) ? 0 : getConsignee().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getFreightPrice() == null) ? 0 : getFreightPrice().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getIntegralPrice() == null) ? 0 : getIntegralPrice().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getActualPrice() == null) ? 0 : getActualPrice().hashCode());
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getShipSn() == null) ? 0 : getShipSn().hashCode());
        result = prime * result + ((getShipChannel() == null) ? 0 : getShipChannel().hashCode());
        result = prime * result + ((getShipTime() == null) ? 0 : getShipTime().hashCode());
        result = prime * result + ((getConfirmTime() == null) ? 0 : getConfirmTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table tinymall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER"),
        userId("user_id", "userId", "INTEGER"),
        orderSn("order_sn", "orderSn", "VARCHAR"),
        orderStatus("order_status", "orderStatus", "SMALLINT"),
        consignee("consignee", "consignee", "VARCHAR"),
        mobile("mobile", "mobile", "VARCHAR"),
        address("address", "address", "VARCHAR"),
        goodsPrice("goods_price", "goodsPrice", "DECIMAL"),
        freightPrice("freight_price", "freightPrice", "DECIMAL"),
        couponPrice("coupon_price", "couponPrice", "DECIMAL"),
        integralPrice("integral_price", "integralPrice", "DECIMAL"),
        orderPrice("order_price", "orderPrice", "DECIMAL"),
        actualPrice("actual_price", "actualPrice", "DECIMAL"),
        payId("pay_id", "payId", "VARCHAR"),
        payTime("pay_time", "payTime", "TIMESTAMP"),
        shipSn("ship_sn", "shipSn", "VARCHAR"),
        shipChannel("ship_channel", "shipChannel", "VARCHAR"),
        shipTime("ship_time", "shipTime", "TIMESTAMP"),
        confirmTime("confirm_time", "confirmTime", "TIMESTAMP"),
        endTime("end_time", "endTime", "TIMESTAMP"),
        addTime("add_time", "addTime", "TIMESTAMP"),
        deleted("deleted", "deleted", "BIT");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tinymall_order
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }
    }
}