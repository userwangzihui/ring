package com.j1902.shopping.service;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.pojo.Cart;
import com.j1902.shopping.pojo.User;

import java.util.List;

public interface CartService {
    public void addCart(Cart cart);
    public List<Cart> getById(Integer id);
    public PageInfo<Cart> getByCount(Integer currentPage, Integer number, Integer userId);
    public void deleteCart();
}
