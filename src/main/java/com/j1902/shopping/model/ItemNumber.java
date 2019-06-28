package com.j1902.shopping.model;

import com.j1902.shopping.pojo.Item;

public class ItemNumber extends Item {
    private Integer number;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ItemNumber() {
    }
}
