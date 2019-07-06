package com.j1902.shopping.service;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.pojo.User;

import java.util.List;

public interface ItemService {
    public List<Item> getByItem();
    public List<Item> getByBuyNumber();
    public List<Item> getByPrice();
    public Item getById(Integer id);
    public PageInfo<Item> getItemAll(Integer currentPage, Integer number);
    public PageInfo<Item> getItembyItemSeries(Integer currentPage, Integer number,String itemSeries);

}
