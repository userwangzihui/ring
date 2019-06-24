package com.j1902.shopping.pojo;

public class Item {
    private Integer itemId;

    private String itemName;

    private String itemSeries;

    private String itemType;

    private String itemHeight;

    private String itemSize;

    private Integer itemNumber;

    private Double itemPrice;

    private String itemImg1;

    private String itemImg2;

    private String itemImg3;

    private String itemImg4;

    private String itmeInfo;

    private Integer itmeBuynumber;

    private Integer itmeEval;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemSeries() {
        return itemSeries;
    }

    public void setItemSeries(String itemSeries) {
        this.itemSeries = itemSeries == null ? null : itemSeries.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(String itemHeight) {
        this.itemHeight = itemHeight == null ? null : itemHeight.trim();
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize == null ? null : itemSize.trim();
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemImg1() {
        return itemImg1;
    }

    public void setItemImg1(String itemImg1) {
        this.itemImg1 = itemImg1 == null ? null : itemImg1.trim();
    }

    public String getItemImg2() {
        return itemImg2;
    }

    public void setItemImg2(String itemImg2) {
        this.itemImg2 = itemImg2 == null ? null : itemImg2.trim();
    }

    public String getItemImg3() {
        return itemImg3;
    }

    public void setItemImg3(String itemImg3) {
        this.itemImg3 = itemImg3 == null ? null : itemImg3.trim();
    }

    public String getItemImg4() {
        return itemImg4;
    }

    public void setItemImg4(String itemImg4) {
        this.itemImg4 = itemImg4 == null ? null : itemImg4.trim();
    }

    public String getItmeInfo() {
        return itmeInfo;
    }

    public void setItmeInfo(String itmeInfo) {
        this.itmeInfo = itmeInfo == null ? null : itmeInfo.trim();
    }

    public Integer getItmeBuynumber() {
        return itmeBuynumber;
    }

    public void setItmeBuynumber(Integer itmeBuynumber) {
        this.itmeBuynumber = itmeBuynumber;
    }

    public Integer getItmeEval() {
        return itmeEval;
    }

    public void setItmeEval(Integer itmeEval) {
        this.itmeEval = itmeEval;
    }
}