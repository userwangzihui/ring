package com.j1902.shopping.model;

import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrdersQv extends CountOrder {
    private List<Order> orderList;

    @Override
    public String toString() {
        return "OrdersQv{" +
                "orderList=" + orderList +
                '}';
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public OrdersQv() {
    }
}
