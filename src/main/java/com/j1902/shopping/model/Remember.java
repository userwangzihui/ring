package com.j1902.shopping.model;

import com.j1902.shopping.pojo.Admin;

public class Remember extends Admin {
    private String remember;

    public Remember(String remember) {
        this.remember = remember;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    @Override
    public String toString() {
        return "Remember{" +
                "remember='" + remember + '\'' +
                '}';
    }
}
