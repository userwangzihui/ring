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
        UserAddressExample userAddressExample = new UserAddressExample();
        UserAddressExample.Criteria or = userAddressExample.or();
        or.andAddressIdEqualTo(uid);
        or.andAddressInfoEqualTo(address);
        List<UserAddress> userAddresses = userAddressMapper.selectByExample(userAddressExample);
        return userAddresses!=null?userAddresses.get(0):null;
    }
}
