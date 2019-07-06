package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.UserAddressMapper;
import com.j1902.shopping.pojo.UserAddress;
import com.j1902.shopping.pojo.UserAddressExample;
import com.j1902.shopping.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public UserAddress selectByUser(String address,Integer uid) {
        System.out.println("address = " + address);
        System.out.println("uid = " + uid);
        UserAddressExample userAddressExample = new UserAddressExample();
        UserAddressExample.Criteria or = userAddressExample.or();
        or.andAddressUseridEqualTo(uid).andAddressInfoEqualTo(address);
        List<UserAddress> userAddresses = userAddressMapper.selectByExample(userAddressExample);
        System.out.println("userAddresses = " + userAddresses);
        return userAddresses!=null?userAddresses.get(0):null;
    }

    @Override
    public void insert(UserAddress userAddress) {
        userAddressMapper.insert(userAddress);
    }
}
