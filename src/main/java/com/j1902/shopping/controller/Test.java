package com.j1902.shopping.controller;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.mapper.CountOrderMapper;
import com.j1902.shopping.model.OrdersQv;
import com.j1902.shopping.model.Remember;
import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.Item;
import com.j1902.shopping.service.AdminService;
import com.j1902.shopping.service.ItemService;
import com.j1902.shopping.service.OrderService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Test {
    @Autowired
    private ItemService itemService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/AdminLogin")
    public String L(HttpServletRequest request, HttpSession session, Map<String, Object> map) throws UnsupportedEncodingException {
        Remember cookAdmin = adminService.showPwd(request);
        if (cookAdmin != null) {
            session.setAttribute("adminName", cookAdmin.getAdminName());
            session.setAttribute("adminPwd", cookAdmin.getAdminPwd());
            session.setAttribute("adminRemember", cookAdmin.getRemember());
        } else {
            if (session.getAttribute("to")== null&&session.getAttribute("one")==null) {
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

    @RequestMapping("/adminOrder")
    public String adminOrder(Map<String, Object> map, Integer number) {
        PageInfo<OrdersQv> pa = null;
        String order = "count_createtime  desc";
        if (number != null) {
            pa = orderService.seletCountOrderByPage(number, 2,order, "已处理");
        } else {
            pa = orderService.seletCountOrderByPage(1, 2, order,"已处理");
        }
        map.put("del", pa);
        System.out.println(pa);
        return "back/order";
    }

    @RequestMapping("/adminOrder_unfinished")
    public String adminOrder_unfinished(Map<String, Object> map,Integer currentPage) {
        PageInfo<OrdersQv> pa = null;
        String order = "count_createtime  desc";
        if (currentPage != null) {
            pa = orderService.seletCountOrderByPage(currentPage, 2,order ,"未处理");
        } else {
            pa = orderService.seletCountOrderByPage(1, 2, order,"未处理");
        }
        map.put("undel", pa);
        return "back/order_unfinished";
    }



    @RequestMapping("/forget")
    public String forget(){
        return "front/forget";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("ADMIN_LOGIN");
        return "back/login";
    }
    @RequestMapping("/dealwith")
    public String OrderDealWith(Integer id,Integer Page){
        orderService.updateCountOrderStaById(id);
        return "redirect:adminOrder_unfinished?currentPage="+Page;
    }

    @RequestMapping("/dealWait")
    public String OrderDealWait(){
        orderService.updateCountOrderStaBySat();
        return "redirect:adminOrder_unfinished";
    }
    @RequestMapping("/message")
    @ResponseBody
    public Integer getWaitOrder(){
        Map<String,Object> map = new HashMap<>();
        int i = orderService.selectWaitCountOrder();
        return i;
    }

    @RequestMapping("/toMemberInfo")
    public String toMemberInfo(){
        return "fornt/member_info";
    }

    @RequestMapping("/loginout")
    public String loginOut(HttpSession session){
        session.removeAttribute("USER_LOGIN");
        return "redirect:frontLogin";
    }
}
