package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.ItemMapper;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.pojo.ItemExample;
import com.j1902.shopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> getByItem() {
        List<Item> items = itemMapper.selectByExample(null);
        return items;
    }

    @Override
    public List<Item> getByBuyNumber() {
        ItemExample itemExample = new ItemExample();
        itemExample.setOrderByClause("itme_buynumber");
        List<Item> items = itemMapper.selectByExample(itemExample);
        return items;
    }
}
