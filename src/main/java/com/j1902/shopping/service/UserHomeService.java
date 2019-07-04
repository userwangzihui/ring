package com.j1902.shopping.service;

import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.Order;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.pojo.UserAddress;

import java.util.List;

public interface UserHomeService {
    public boolean setPersonalData(User user);
    public List<UserAddress> getUserAddress(Integer id);
    public UserAddress getByIdUserAddress(Integer id);
    public void updateUserIdUserAddress(UserAddress userAddress);
    public void setUserAddress(UserAddress userAddress);
    public void deleteUserAddress(UserAddress userAddress);
    public List<CountOrder> getCountOrders(Integer userId);
    public List<Order> getOrders(Integer orderCountId);
    public CountOrder getByCountIdCountOrder(Integer countId);
    public Order getByOrderIdOrder(Integer orderId);

}
