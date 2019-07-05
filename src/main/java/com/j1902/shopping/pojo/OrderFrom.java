package com.j1902.shopping.pojo;

public class OrderFrom {
    private String orderNumber;
    private String orderTime;
    private Item item;
    private Integer itemNumber;
    private double moneys;
    private String countMethod;
    private String countSat;
    private Integer countId;
    private Integer orderId;
    public Item getItem() {
        return item;
    }


    public void setItem(Item item) {
        this.item = item;
    }


    public Integer getCountId() {
        return countId;
    }

    public void setCountId(Integer countId) {
        this.countId = countId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OrderFrom() {
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public double getMoneys() {
        return moneys;
    }

    public void setMoneys(double moneys) {
        this.moneys = moneys;
    }

    public String getCountMethod() {
        return countMethod;
    }

    public void setCountMethod(String countMethod) {
        this.countMethod = countMethod;
    }

    public String getCountSat() {
        return countSat;
    }

    public void setCountSat(String countSat) {
        this.countSat = countSat;
    }

    @Override
    public String toString() {
        return "OrderFrom{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", item=" + item +
                ", itemNumber=" + itemNumber +
                ", moneys=" + moneys +
                ", countMethod='" + countMethod + '\'' +
                ", countSat='" + countSat + '\'' +
                ", countId=" + countId +
                ", orderId=" + orderId +
                '}';
    }
}
