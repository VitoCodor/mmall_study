package com.mmall.pojo;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer payPlatform;

    private String paltformNumber;

    private String paltformStatus;

    private Date createTime;

    private Date updateTime;

    public PayInfo(Integer id, Integer userId, Long orderNo, Integer payPlatform, String paltformNumber, String paltformStatus, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.orderNo = orderNo;
        this.payPlatform = payPlatform;
        this.paltformNumber = paltformNumber;
        this.paltformStatus = paltformStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public PayInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public String getPaltformNumber() {
        return paltformNumber;
    }

    public void setPaltformNumber(String paltformNumber) {
        this.paltformNumber = paltformNumber == null ? null : paltformNumber.trim();
    }

    public String getPaltformStatus() {
        return paltformStatus;
    }

    public void setPaltformStatus(String paltformStatus) {
        this.paltformStatus = paltformStatus == null ? null : paltformStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PayInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderNo=" + orderNo +
                ", payPlatform=" + payPlatform +
                ", paltformNumber='" + paltformNumber + '\'' +
                ", paltformStatus='" + paltformStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}