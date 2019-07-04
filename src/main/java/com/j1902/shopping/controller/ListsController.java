package com.j1902.shopping.controller;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
@Controller
public class ListsController {
    @Autowired
    ItemService itemService;
    @RequestMapping("/getItemAll")
    public String getItemAll(Integer currentPage,Map<String,Object>map){
        PageInfo<Item> itemAll=null;
        if (currentPage!=null){
            itemAll = itemService.getItemAll(currentPage,4);
        }else {
            itemAll = itemService.getItemAll(1,4);
        }
        map.put("it",itemAll);
        return "front/lists";
    }
    @RequestMapping("/getBySeries")
    public String getByItemSeries(Integer currentPage, Map<String,Object>map, String itemSeries){
        PageInfo<Item> itemAll=null;
        if (currentPage!=null){

            itemAll = itemService.getItembyItemSeries(currentPage, 8, itemSeries);
        }else {
            itemAll  = itemService.getItembyItemSeries(1, 8, itemSeries);
        }
        map.put("it",itemAll);
        map.put("active",itemSeries);
        return "front/lists";
    }

}
