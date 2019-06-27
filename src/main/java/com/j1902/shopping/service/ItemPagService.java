package com.j1902.shopping.service;

import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.pojo.User;

public interface ItemPagService {
    public Item getById(Integer id);
    public void  updateById(User user);
}
