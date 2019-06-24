package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.ItemMapper;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.AddItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddItemServiceImpl implements AddItemService {
    @Autowired
    ItemMapper itemMapper;
    @Override
    public void addItem(Item item) {
        itemMapper.insert(item);

    }
}
