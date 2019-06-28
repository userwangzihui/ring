package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ItemBuyNumberController {
    @Autowired
    ItemService itemService;

        @RequestMapping("/index")
    public String ItemBuyNumber(Map<String ,Object>map){
        List<Item> byBuyNumber = itemService.getByBuyNumber();
        System.out.println("byBuyNumber = " + byBuyNumber);
        for (int i =0;i<8;i++){
            String img="img"+i;
            map.put(img,byBuyNumber.get(i));
        }
        return  "front/index";
    }
    @RequestMapping("/ItemPrice")
    public String ItemPrice(Map<String ,Object>map){
        List<Item> byBuyNumber = itemService.getByPrice();
        for (int i =0;i<8;i++){
            String img="img"+i;
            map.put(img,byBuyNumber.get(i));
        }
        return  "front/index";
    }

}
