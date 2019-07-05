package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.CountOrderMapper;
import com.j1902.shopping.mapper.OrderMapper;
import com.j1902.shopping.mapper.UserAddressMapper;
import com.j1902.shopping.mapper.UserMapper;
import com.j1902.shopping.pojo.*;
import com.j1902.shopping.service.UserHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHomeServiceImpl implements UserHomeService {
    @Autowired
    public OrderMapper orderMapper;
   @Autowired
    private UserMapper userMapper;
   @Autowired
   private UserAddressMapper userAddressMapper;
   @Autowired
   private CountOrderMapper countOrderMapper;


   //修改个人信息
    @Override
    public boolean setPersonalData(User user) {
        UserExample ex = new UserExample();
        UserExample.Criteria criteria = ex.or();
        criteria.andUserPhoneEqualTo(user.getUserPhone());
        int i = userMapper.updateByExampleSelective(user, ex);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public List<UserAddress> getUserAddress(Integer id) {
        UserAddressExample userAddressExample = new UserAddressExample();
        UserAddressExample.Criteria criteria = userAddressExample.or();
        criteria.andAddressUseridEqualTo(id);
        List<UserAddress> userAddresses = userAddressMapper.selectByExample(userAddressExample);
        System.out.println("userAddresses = " + userAddresses.size());
        return userAddresses;
    }

    @Override
    public UserAddress getByIdUserAddress(Integer id) {
        UserAddress userAddress = userAddressMapper.selectByPrimaryKey(id);
        return userAddress;
    }

    @Override
    public void updateUserIdUserAddress(UserAddress userAddress) {
        UserAddressExample userAddressExample = new UserAddressExample();
        UserAddressExample.Criteria criteria = userAddressExample.or();
        criteria.andAddressIdEqualTo(userAddress.getAddressId());
        userAddressMapper.updateByExampleSelective(userAddress,userAddressExample);

    }

    @Override
    public void setUserAddress(UserAddress userAddress) {
        userAddressMapper.insertSelective(userAddress);
    }

    @Override
    public void deleteUserAddress(UserAddress userAddress) {
        userAddressMapper.deleteByPrimaryKey(userAddress.getAddressId());
    }

    @Override
    public List<CountOrder> getCountOrders(Integer userId) {
        CountOrderExample countOrderExample=new CountOrderExample();
        CountOrderExample.Criteria criteria = countOrderExample.or();
        criteria.andCountUseridEqualTo(userId);
        List<CountOrder> countOrders = countOrderMapper.selectByExample(countOrderExample);
        System.out.println("countOrders = " + countOrders.size());
        return countOrders;
    }

    @Override
    public List<Order> getOrders(Integer orderCountId) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.or();
       criteria.andOrderCountIdEqualTo(orderCountId);
        List<Order> orders = orderMapper.selectByExample(orderExample);
        return orders;
    }

    @Override
    public CountOrder getByCountIdCountOrder(Integer countId) {
        CountOrder countOrder = countOrderMapper.selectByPrimaryKey(countId);
        return countOrder;
    }

    @Override
    public Order getByOrderIdOrder(Integer orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        return order;
    }

    @Override
    public void deleteByIdOrder(Integer orderId) {
        orderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public User getByUserId(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public void updateUserIdCountOrder(CountOrder countOrder) {
        CountOrderExample countOrderExample = new CountOrderExample();
        CountOrderExample.Criteria criteria = countOrderExample.or();
        criteria.andCountIdEqualTo(countOrder.getCountId());
        countOrderMapper.updateByExampleSelective(countOrder,countOrderExample);
    }

    @Override
    public UserAddress getUserAddress(String addressInfo) {
        UserAddressExample userAddressExample = new UserAddressExample();
        UserAddressExample.Criteria criteria = userAddressExample.or();
        criteria.andAddressInfoEqualTo(addressInfo);
        List<UserAddress> userAddresses = userAddressMapper.selectByExample(userAddressExample);
        return userAddresses.get(0);
    }

}
