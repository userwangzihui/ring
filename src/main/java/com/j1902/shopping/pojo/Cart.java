package com.j1902.shopping.pojo;

public class Cart {
    private Integer cartId;

    private Integer userId;

    private Integer itemId;

    private Integer itemNumber;

    private String cartItemName;

    private String cartItemMaterial;

    private String cartItemSize;

    private Integer cartItemNumber;

    private Double cartItemPrice;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getCartItemName() {
        return cartItemName;
    }

    public void setCartItemName(String cartItemName) {
        this.cartItemName = cartItemName == null ? null : cartItemName.trim();
    }

    public String getCartItemMaterial() {
        return cartItemMaterial;
    }

    public void setCartItemMaterial(String cartItemMaterial) {
        this.cartItemMaterial = cartItemMaterial == null ? null : cartItemMaterial.trim();
    }

    public String getCartItemSize() {
        return cartItemSize;
    }

    public void setCartItemSize(String cartItemSize) {
        this.cartItemSize = cartItemSize == null ? null : cartItemSize.trim();
    }

    public Integer getCartItemNumber() {
        return cartItemNumber;
    }

    public void setCartItemNumber(Integer cartItemNumber) {
        this.cartItemNumber = cartItemNumber;
    }

    public Double getCartItemPrice() {
        return cartItemPrice;
    }

    public void setCartItemPrice(Double cartItemPrice) {
        this.cartItemPrice = cartItemPrice;
    }
}