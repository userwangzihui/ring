package com.j1902.shopping.config;

import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.CartService;
import com.j1902.shopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class MyStartUpRunner implements CommandLineRunner {
    @Autowired
    ItemService itemService;
    @Autowired
    CartService cartService;

    @Override
    public void run(String... args) throws Exception {
       itemService.getByItem();
    }
}
