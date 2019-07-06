package com.j1902.shopping.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.j1902.shopping.mapper.ItemMapper;
import com.j1902.shopping.pojo.CartExample;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.pojo.ItemExample;
import com.j1902.shopping.service.ItemService;
import com.j1902.shopping.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private RedisUtils redisUtils;
    @Override
    public void getByItem() {
        List<Item> items = itemMapper.selectByExample(null);
        String join = String.join(",", items.toArray());
        redisUtils.set("indexItems",join);
    }

    @Override
    public List<Item> getByBuyNumber() {
        List<Item> items = itemMapper.getByBuyNumber();
        return items;
    }

    @Override
    public List<Item> getByPrice() {
        List<Item> items = itemMapper.getByPrice();
        return items;
    }

    @Override
    public Item getById(Integer id) {
        Item item = itemMapper.selectByPrimaryKey(id);
        return item;
    }

    @Override
    public PageInfo<Item> getItemAll(Integer currentPage, Integer number) {
       PageHelper.startPage(currentPage,number);
        List<Item> items = itemMapper.selectByExample(null);
        PageInfo<Item> itemPageInfo = new PageInfo<>(items);
        return itemPageInfo;
    }

    @Override
    public PageInfo<Item> getItembyItemSeries(Integer currentPage, Integer number,String itemSeries) {
        PageHelper.startPage(currentPage,number);
        ItemExample itemExample = new ItemExample();
        ItemExample.Criteria criteria = itemExample.or();
        criteria.andItemSeriesEqualTo(itemSeries);
        List<Item> items = itemMapper.selectByExample(itemExample);
        PageInfo<Item> itemPageInfo = new PageInfo<>(items);
        return itemPageInfo;

    }
}
