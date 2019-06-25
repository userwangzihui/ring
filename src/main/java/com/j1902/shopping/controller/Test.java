package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.ItemService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

@Controller
public class Test {
    @Autowired
    ItemService itemService;
    @RequestMapping("/AdminLogin")
    public String L(HttpServletRequest request,Map<String,Object>map) throws UnsupportedEncodingException {
        Cookie[] cookies = request.getCookies();
        Admin cookAdmin = null;

        if (cookies != null && cookies.length > 0) {
            System.out.println(22222);
            for (Cookie c : cookies) {
                if ("AUTO_LOGIN_ADMIN_INFO".equals(c.getName())) {
                    String userJson = c.getValue();
                    userJson = URLDecoder.decode(userJson, "UTF-8");
                    cookAdmin = JsonUtils.jsonToPojo(userJson, Admin.class);
                    map.put("AdminName", cookAdmin.getAdminName());
                    System.out.println("cookAdmin.getAdminName() = " + cookAdmin.getAdminName());
                    map.put("password", cookAdmin.getAdminPwd());
                    return "back/login";
                }
            }


        }
        return "back/login";

    }
    @RequestMapping("/order")
    public String Order(Map<String,Object>map) {
        List<Item> byItem = itemService.getByItem();
        map.put("ITEM",byItem);
        return "back/goods";
    }
   @RequestMapping("/goodsAdd")
    public String goodsAdd(){
        return "back/goods_add";
   }

}
