package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.*;
import com.j1902.shopping.service.ItemService;
import com.j1902.shopping.service.UserAddressService;
import com.j1902.shopping.service.UserHomeService;
import com.j1902.shopping.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserHomeController {

    @Autowired
    private UserHomeService userHomeService;
    @Autowired
    private UserRegisterService userRegisterService;
    @Autowired
    public ItemService itemService;
    @Autowired
    public UserAddressService userAddressService;
    //个人信息
    @RequestMapping("/personalData")
    @ResponseBody
    public String PersonalData(User user, HttpSession session,String year,String day,String month) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date =simpleDateFormat.parse(year+"-"+month+"-"+day);
        System.out.println("date = " + date.toString());
        user.setUserBirthday(date);
        UserAddress userAddress = new UserAddress();
        userAddress.setAddressCode("435400");
        userAddress.setAddressInfo(user.getUserAddress());
        userAddress.setAddressPhone(user.getUserPhone());
        userAddress.setAddressUserid(user.getUserId());
        userAddress.setAddressTousername(user.getUserRealname());
        userAddressService.insert(userAddress);
        if (userHomeService.setPersonalData(user)){
            session.setAttribute("user",user);
            return "1";
        }
        return "2";
    }
    //跳个人信息页面
    @RequestMapping("/member_info")
    public String userInfo(User user,Map<String,Object> map){
        User byUserId = userHomeService.getByUserId(user.getUserId());
        map.put("USER",byUserId);
        return "front/member_info";
    }
//跳主页
    @RequestMapping("/member_index")
    public String index(String userPhone, Map<String,Object> map, HttpSession session){
        System.out.println("1111");
        System.out.println("user = " + userPhone);
        List<User> user = userRegisterService.getUser(userPhone);
        session.setAttribute("USER_LOGIN",user.get(0));
        return "front/member_index";
    }
    //跳收货地址
    @RequestMapping("/address")
    public String Address(User user, Map<String,Object> map, HttpServletRequest request,Integer userId){
        user.setUserId(userId);
        List<UserAddress> userAddress = userHomeService.getUserAddress(user.getUserId());
        if (userAddress.size()>0){
            System.out.println("userAddress 04= " + userAddress.get(0).toString());
            map.put("listAddress",userAddress);
            map.put("USER",user);
            return "front/member_addr";
        }
        map.put("USER",user);
        return "front/member_addr";
    }
    //查找收货地址
@RequestMapping("/getAddress")
    @ResponseBody
    public Map<String,Object> getAddress(Integer id){
        System.out.println("id = " + id);
        System.out.println("nihao");
        Map<String,Object> re=new HashMap<>();
        UserAddress byIdUserAddress = userHomeService.getByIdUserAddress(id);
        re.put("Address",byIdUserAddress);
        return re;
    }
    @RequestMapping("/getAndUpdateAddress")
    public String getAndUpdateAddress(UserAddress userAddress){
        System.out.println("un="+userAddress.getAddressId()+"+"+userAddress.getAddressUserid()+"+"+userAddress.getAddressTousername()+"+"+userAddress.getAddressInfo()+"+"+userAddress.getAddressCode()+"+"+userAddress.getAddressPhone());
        if(userAddress.getAddressId()==null||userAddress.getAddressId()<0){
            userHomeService.setUserAddress(userAddress);

            System.out.println("你在哪");
            return "redirect:address?userId="+userAddress.getAddressUserid();
        }else {
            userHomeService.updateUserIdUserAddress(userAddress);
            System.out.println("你在哪z");
            return "redirect:address?userId="+userAddress.getAddressUserid();
        }
}
//删除收货地址
    @RequestMapping("/deleteAddress")
    @ResponseBody
    public void deleteAddress(UserAddress userAddress){
    userHomeService.deleteUserAddress(userAddress);

    }
    //查询用户订单
    @RequestMapping("/member_order")
    public String getCustomerOrders(Integer userId,Map<String,Object> map){

       List<OrderFrom> orderFroms=new ArrayList<>();
        List<CountOrder> countOrder = userHomeService.getCountOrders(userId);
//        if (countOrder!=null&&countOrder.size()>0){

            for (CountOrder countOrder1 : countOrder) {
                List<Order> order = userHomeService.getOrders(countOrder1.getCountId());
                for (Order order1 : order) {
                    Item item = itemService.getById(order1.getOrderItemId());
                    OrderFrom orderFrom = new OrderFrom();
                    orderFrom.setItem(item);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
                    String format = simpleDateFormat.format(countOrder1.getCountCreatetime());
                    System.out.println("format = " + format);
                    orderFrom.setOrderNumber(order1.getOrderCountId() + "");
                    orderFrom.setOrderTime(format);
                    orderFrom.setItemNumber(order1.getOrderNumber());
                    orderFrom.setMoneys(order1.getOrderMoney());
                    orderFrom.setCountMethod(countOrder1.getCountMethod());
                    orderFrom.setCountSat(countOrder1.getCountSat());
                    orderFrom.setCountId(countOrder1.getCountId());
                    orderFrom.setOrderId(order1.getOrderId());
                    System.out.println("orderFrom = " + orderFrom);
                    orderFroms.add(orderFrom);
                }
            }
     //   }
        map.put("userId",userId);
        map.put("OrderFrom",orderFroms);
        return "front/member_order";
    }
    //查看订单详情
    @RequestMapping("/member_order_detail")
    public String memberOrderDetail( Map<String,Object> map ,Integer countId,Integer orderId){
        System.out.println("countId = " + countId);
        System.out.println("orderId = " + orderId);
        CountOrder countOrder = userHomeService.getByCountIdCountOrder(countId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(countOrder.getCountCreatetime());
        UserAddress userAddress = userHomeService.getUserAddress(countOrder.getCountAddress());
        Order order = userHomeService.getByOrderIdOrder(orderId);
        Item item = itemService.getById(order.getOrderItemId());
        map.put("CountOrder",countOrder);
        map.put("Order",order);
        map.put("Item",item);
        map.put("time",format);
        map.put("userAddress",userAddress);
        return "front/member_order_detail";
    }
    //删除用户订单
    @RequestMapping("/deleteOrders")
    public String deleteOrders(Integer orderId,Integer userId) {
        userHomeService.deleteByIdOrder(orderId);
    return "redirect:../member_order?userId="+userId;
    }
    //订单支付
    @RequestMapping("/countSat")
    public String countSat(CountOrder countOrder) {
        countOrder.setCountSat("已处理");
        userHomeService.updateUserIdCountOrder(countOrder);
        return "redirect:../member_order?userId="+countOrder.getCountUserid();
    }
}

