package com.j1902.shopping.pojo;

public class Order {
    private Integer orderId;

    private Integer orderItemId;

    private Integer orderNumber;

    private Double orderMoney;

    private Integer orderCountId;

    private String orderItemname;

    private String orderItemType;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderCountId() {
        return orderCountId;
    }

    public void setOrderCountId(Integer orderCountId) {
        this.orderCountId = orderCountId;
    }

    public String getOrderItemname() {
        return orderItemname;
    }

    public void setOrderItemname(String orderItemname) {
        this.orderItemname = orderItemname == null ? null : orderItemname.trim();
    }

    public String getOrderItemType() {
        return orderItemType;
    }

    public void setOrderItemType(String orderItemType) {
        this.orderItemType = orderItemType == null ? null : orderItemType.trim();
    }
}