package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.Cart;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.service.CartService;
import com.j1902.shopping.service.ItemService;
import com.j1902.shopping.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ItemBuyNumberController {
    @Autowired
    ItemService itemService;
    @Autowired
    CartService cartService;
    @Autowired
    RedisUtils redisUtils;

   /* @RequestMapping("/index")
    public String ItemBuyNumber(HttpSession session, Map<String, Object> map) {
        List<Item> byBuyNumber = itemService.getByBuyNumber();
        User user = (User) session.getAttribute("USER_LOGIN");
        if (user!=null){
            List<Cart> byId = cartService.getById(user.getUserId());
            map.put("number",byId!=null?byId.size():0);
        }
        for (int i = 0; i < 8; i++) {
            String img = "img" + i;
            map.put(img, byBuyNumber.get(i));
        }

        return "front/index";
    }*/
   // 使用redis查询首页
   @RequestMapping("/index")
    public String ItemBuyNumber(HttpSession session, Map<String, Object> map) {
        List<Item> byBuyNumber = itemService.getByBuyNumber();
        User user = (User) session.getAttribute("USER_LOGIN");
        if (user!=null){
            List<Cart> byId = cartService.getById(user.getUserId());
            map.put("number",byId!=null?byId.size():0);
        }
        for (int i = 0; i < 8; i++) {
            String img = "img" + i;
            String indexItems = redisUtils.get("indexItems");
            String[] items= indexItems.split(",");
            map.put(img,items[i]);
        }

        return "front/index";
    }

    @RequestMapping("/ItemPrice")
    public String ItemPrice(HttpSession session, Map<String, Object> map) {
        User user = (User) session.getAttribute("USER_LOGIN");
        if (user!=null){
            List<Cart> byId = cartService.getById(user.getUserId());
            map.put("number",byId!=null?byId.size():0);
            map.put("userInfo",user.getUserName());
        }
        List<Item> byBuyNumber = itemService.getByPrice();
        for (int i = 0; i < 8; i++) {
            String img = "img" + i;
            map.put(img, byBuyNumber.get(i));
        }
        return "front/index";
    }

}
