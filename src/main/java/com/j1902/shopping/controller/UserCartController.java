package com.j1902.shopping.controller;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.model.ItemNumber;
import com.j1902.shopping.model.OrdersQv;
import com.j1902.shopping.pojo.*;
import com.j1902.shopping.service.*;
import com.j1902.shopping.utils.JsonUtils;
import org.apache.ibatis.annotations.Param;
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
    @Autowired
    UserAddressService userAddressService;

    @Autowired
    OrderService orderService;

    @Autowired
    CountOrderService countOrderService;

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
        ///////////

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
        long total = cartss.getTotal();
      session.setAttribute("CART_NUMBER",total);
        System.out.println("cartss = " + cartss);
        System.out.println("页数" + cartss.getSize());
        //  map.put("carts",carts);
        return "front/cart";
    }

    //清空购物车
    @RequestMapping("/removeCart")
    public String removeCart(HttpSession session) {
        User user = (User) session.getAttribute("USER_LOGIN");
        cartService.deleteCart(user.getUserId());
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
        List<Cart> carts = cartService.getById(user.getUserId());
        map.put("item", carts);
        Double money = 0.0;
        int count = 0;
        for (Cart cart : carts) {
            money += cart.getCartItemPrice();
            count += cart.getCartItemNumber();
        }
        map.put("price", money);
        map.put("count", count);
        return "front/cartorder";
    }

    //删除单个购物记录
    @RequestMapping("/deleteById")
    public String deleteById(Integer cid) {
        cartService.deleteByCarId(cid);
        return "redirect:pageCart";
    }

    //结账
    @RequestMapping("/redPag")
    public String redPag(Map<String, Object> map, HttpSession session, OrdersQv orders, Double countMoney, @Param("message") String message) {
        User user = (User) session.getAttribute("USER_LOGIN");
        CountOrder countOrder = new CountOrder();
        countOrder.setCountSat("待处理");
        countOrder.setCountCreatetime(new Date());
        countOrder.setCountRemarks(message);
        countOrder.setCountUserid(user.getUserId());
        UserAddress userAddress = userAddressService.selectByUser(user.getUserAddress(), user.getUserId());
        countOrder.setCountAddress(userAddress.getAddressInfo());
        countOrder.setCountPhone(userAddress.getAddressPhone());
        countOrder.setCountUsername(userAddress.getAddressTousername());
        countOrder.setCountMethod("圆通快递");
        countOrder.setCountMoney(countMoney);
        countOrderService.insert(countOrder);
        Integer orderCountId = countOrder.getCountId();
        for (Order order : orders.getOrderList()) {
            order.setOrderCountId(orderCountId);
        }
        int i = orderService.insertOrder(orders.getOrderList());
        //订单生成后，删除购物车，具体应该删除被购买的商品。
        cartService.deleteCart(user.getUserId());
        map.put("money", countMoney);
        map.put("countId", orderCountId);
        return "front/cart_order_success";
    }

    //查看订单
    @RequestMapping("/toCountOrder")
    public String toCountOrder(Integer cid) {
        System.out.println("我进入了");
        return null;
    }
}
