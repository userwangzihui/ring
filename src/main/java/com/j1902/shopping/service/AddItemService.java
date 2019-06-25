package com.j1902.shopping.service;

import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.Item;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public interface AddItemService {
    public void addItem(Item item);
}
