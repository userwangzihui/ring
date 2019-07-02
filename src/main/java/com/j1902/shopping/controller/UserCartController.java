package com.j1902.shopping.controller;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.model.ItemNumber;
import com.j1902.shopping.pojo.*;
import com.j1902.shopping.service.CartService;
import com.j1902.shopping.service.ItemPagService;
import com.j1902.shopping.service.ItemService;
import com.j1902.shopping.service.UserService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserCartController {
    @Autowired
    ItemService itemService;
    @Autowired
    ItemPagService itemPagService;
    @Autowired
    CartService cartService;
    @Autowired
    UserService userService;

    @RequestMapping("/detail")
    public String ItemCart(Integer id, Map<String, Object> map) {
        Item item = itemService.getById(id);
        map.put("item", item);
        return "front/detail";
    }

    //直接购买
    @RequestMapping("/pag")
    public String itemPag(Integer id, Integer number, Map<String, Object> map) {
        double Price = 0;
        Item item = itemPagService.getById(id);
        Price = number * item.getItemPrice();
        map.put("price", Price);
        System.out.println("item = " + item);
        ItemNumber itemNumber = new ItemNumber();
        itemNumber.setNumber(number);
        System.out.println(item.getItemSeries());
        itemNumber.setItemSeries(item.getItemSeries());
        itemNumber.setItemSize(item.getItemSize());
        itemNumber.setItemType(item.getItemType());
        itemNumber.setItemPrice(item.getItemPrice());
        List<ItemNumber> items = new ArrayList<>();
        items.add(itemNumber);
        map.put("item", items);
        return "front/cart_order";
    }

    @RequestMapping("/updateAddress")
    public String updateAddress(User user) {
        itemPagService.updateById(user);
        return "redirect:pag";
    }

    //添加购物车
    @RequestMapping("/card")
    public String itemCard(Integer id, Integer number, HttpSession session) {
        double Price = 0;
        Item item = itemPagService.getById(id);
        System.out.println(item);
        User user = (User) session.getAttribute("USER_LOGIN");
        Price = number * item.getItemPrice();
        Cart cart = new Cart();
        cart.setUserId(user.getUserId());
        cart.setItemId(id);
        cart.setItemNumber(number);
        cart.setCartItemName(item.getItemSeries());
        cart.setCartItemMaterial(item.getItemType());
        cart.setCartItemSize(item.getItemSize());
        cart.setCartItemNumber(number);
        cart.setCartItemPrice(Price);
        cart.setCartItemImg(item.getItemImg2());
        cartService.addCart(cart);
        return "redirect:pageCart";

    }

    //分页
    @RequestMapping("/pageCart")
    public String pageCart(Map<String, Object> map, HttpSession session, Integer currentPage) {
        double prices = 0;
        User user = (User) session.getAttribute("USER_LOGIN");
        List<Cart> carts = cartService.getById(user.getUserId());
        PageInfo<Cart> cartss = null;
        //付钱金额
        for (Cart cart1 : carts) {
            prices += cart1.getCartItemPrice();
        }

        map.put("prices", prices);
        if (currentPage != null) {
            cartss = cartService.getByCount(currentPage, 3, user.getUserId());

        } else {
            cartss = cartService.getByCount(1, 3, user.getUserId());
        }
        map.put("carts", cartss);
        System.out.println("cartss = " + cartss);
        System.out.println("页数" + cartss.getSize());
        //  map.put("carts",carts);
        return "front/cart";
    }

    //清空购物车
    @RequestMapping("/removeCart")
    public String removeCart() {
        System.out.println(1111);
        cartService.deleteCart();
        return "redirect:pageCart";
    }

    @RequestMapping("/cartAgreement")
    public String cartAgreement() {
        return "front/cart_agreement";
    }


    //购物车结算
    @RequestMapping("/cartOrder")
    public String cartOrder(HttpSession session, Map<String, Object> map) {
        double prices = 0;
        User user = (User) session.getAttribute("USER_LOGIN");
        PageInfo<Cart> carts = cartService.getByCount(1, 3, user.getUserId());
        map.put("carts", carts);
        return "front/cart_order";
    }
    //直接购买
    @RequestMapping("/redPag")
    public String redPag(HttpSession session, List<Order> orders,String message){
        User user = (User) session.getAttribute("USER_LOGIN");
        CountOrder countOrder = new CountOrder();
        countOrder.setCountSat("待处理");
        countOrder.setCountCreatetime(new Date());
        countOrder.setCountRemarks(message);
        countOrder.setCountUserid(user.getUserId());
        cartService;
        return null;
    }
}
