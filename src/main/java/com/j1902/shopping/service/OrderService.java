package com.j1902.shopping.service;

import com.github.pagehelper.PageInfo;
import com.j1902.shopping.model.OrdersQv;
import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.Order;

import java.util.List;

public interface OrderService {
    public List<CountOrder> selectCountOrdersBySta(String sta);
    public PageInfo<OrdersQv> seletCountOrderByPage(Integer current,Integer number,String order,String sta);
    void updateCountOrderStaById(Integer id);
    void updateCountOrderStaBySat();
    int selectWaitCountOrder();
    int insertOrder(List<Order> orders);
}
