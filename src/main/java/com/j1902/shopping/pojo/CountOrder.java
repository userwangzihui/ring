package com.j1902.shopping.pojo;

import java.util.Date;

public class CountOrder {
    private Integer countId;

    private Integer countUserid;

    private String countRemarks;

    private Date countCreatetime;

    private String countMethod;

    private Double countMoney;

    private String countSat;

    private String countUsername;

    private String countPhone;

    private String countAddress;

    public Integer getCountId() {
        return countId;
    }

    public void setCountId(Integer countId) {
        this.countId = countId;
    }

    public Integer getCountUserid() {
        return countUserid;
    }

    public void setCountUserid(Integer countUserid) {
        this.countUserid = countUserid;
    }

    public String getCountRemarks() {
        return countRemarks;
    }

    public void setCountRemarks(String countRemarks) {
        this.countRemarks = countRemarks == null ? null : countRemarks.trim();
    }

    public Date getCountCreatetime() {
        return countCreatetime;
    }

    public void setCountCreatetime(Date countCreatetime) {
        this.countCreatetime = countCreatetime;
    }

    public String getCountMethod() {
        return countMethod;
    }

    public void setCountMethod(String countMethod) {
        this.countMethod = countMethod == null ? null : countMethod.trim();
    }

    public Double getCountMoney() {
        return countMoney;
    }

    public void setCountMoney(Double countMoney) {
        this.countMoney = countMoney;
    }

    public String getCountSat() {
        return countSat;
    }

    public void setCountSat(String countSat) {
        this.countSat = countSat == null ? null : countSat.trim();
    }

    public String getCountUsername() {
        return countUsername;
    }

    public void setCountUsername(String countUsername) {
        this.countUsername = countUsername == null ? null : countUsername.trim();
    }

    public String getCountPhone() {
        return countPhone;
    }

    public void setCountPhone(String countPhone) {
        this.countPhone = countPhone == null ? null : countPhone.trim();
    }

    public String getCountAddress() {
        return countAddress;
    }

    public void setCountAddress(String countAddress) {
        this.countAddress = countAddress == null ? null : countAddress.trim();
    }
}