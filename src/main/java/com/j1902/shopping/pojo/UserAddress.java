package com.j1902.shopping.pojo;

public class UserAddress {
    private Integer addressId;

    private Integer addressUserid;

    private String addressTousername;

    private String addressInfo;

    private String addressPhone;

    private String addressCode;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressUserid() {
        return addressUserid;
    }

    public void setAddressUserid(Integer addressUserid) {
        this.addressUserid = addressUserid;
    }

    public String getAddressTousername() {
        return addressTousername;
    }

    public void setAddressTousername(String addressTousername) {
        this.addressTousername = addressTousername == null ? null : addressTousername.trim();
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo == null ? null : addressInfo.trim();
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone == null ? null : addressPhone.trim();
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode == null ? null : addressCode.trim();
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "addressId=" + addressId +
                ", addressUserid=" + addressUserid +
                ", addressTousername='" + addressTousername + '\'' +
                ", addressInfo='" + addressInfo + '\'' +
                ", addressPhone='" + addressPhone + '\'' +
                ", addressCode='" + addressCode + '\'' +
                '}';
    }
}