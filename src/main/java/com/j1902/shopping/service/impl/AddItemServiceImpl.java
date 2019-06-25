package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.ItemMapper;
import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.AddItemService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Service
public class AddItemServiceImpl implements AddItemService {
    @Autowired
    ItemMapper itemMapper;

    @Override
    public void addItem(Item item) {
        itemMapper.insert(item);

    }

}
