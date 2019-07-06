package com.j1902.shopping.service;

import com.j1902.shopping.pojo.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserAddressService {
    UserAddress selectByUser(String address,Integer uid);
    void insert(UserAddress userAddress);
}
