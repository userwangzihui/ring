package com.j1902.shopping.controller;

import com.j1902.shopping.model.Remember;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.AdminService;
import com.j1902.shopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Controller
public class Test {
    @Autowired
    private ItemService itemService;
    @Autowired
    private AdminService adminService;

    @RequestMapping("/AdminLogin")
    public String L(HttpServletRequest request, HttpSession session, Map<String, Object> map) throws UnsupportedEncodingException {
        Remember cookAdmin = adminService.showPwd(request);
        System.out.println("好烦："+cookAdmin);
        if (cookAdmin != null) {
            System.out.println("方式1");
            session.setAttribute("adminName", cookAdmin.getAdminName());
            session.setAttribute("adminPwd", cookAdmin.getAdminPwd());
            session.setAttribute("adminRemember", cookAdmin.getRemember());
        } else {
            System.out.println("方式2");
            if (session.getAttribute("to")== null&&session.getAttribute("one")==null) {
                System.out.println("方式3");
                session.removeAttribute("adminName");
                session.removeAttribute("adminPwd");
                session.removeAttribute("adminRemember");
            } else if (session.getAttribute("to")==null&&session.getAttribute("one")!=null){
                session.removeAttribute("adminRemember");
                session.removeAttribute("one");
            }else {
                session.removeAttribute("to");
                session.removeAttribute("one");
            }
        }
        return "back/login";

    }

    @RequestMapping("/order")
    public String Order(Map<String, Object> map) {
        List<Item> byItem = itemService.getByItem();
        map.put("ITEM", byItem);
        return "back/goods";
    }

    @RequestMapping("/goodsAdd")
    public String goodsAdd() {
        return "back/goods_add";
    }

    @RequestMapping("/forget")
    public String forget(){
        return "front/forget";
    }
}
