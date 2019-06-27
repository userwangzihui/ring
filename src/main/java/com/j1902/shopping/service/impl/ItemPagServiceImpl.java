package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.ItemMapper;
import com.j1902.shopping.mapper.UserMapper;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.service.ItemPagService;
import com.sun.mail.imap.protocol.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPagServiceImpl implements ItemPagService {
    @Autowired
    ItemMapper itemMapper;
    @Autowired
    UserMapper userMapper;
    @Override
    public Item getById(Integer id) {
        Item item = itemMapper.selectByPrimaryKey(id);
        return  item;
    }

    @Override
    public void updateById(User user) {
      userMapper.updateByPrimaryKey(user);

    }
}
