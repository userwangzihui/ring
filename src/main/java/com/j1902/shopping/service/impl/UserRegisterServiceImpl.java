package com.j1902.shopping.service.impl;


import com.j1902.shopping.mapper.UserMapper;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.pojo.UserExample;
import com.j1902.shopping.service.UserRegisterService;
import com.j1902.shopping.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserRegisterServiceImpl implements UserRegisterService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void setUser(User user) {
        System.out.println("user = " + user.toString());
        user.setUserPwd(MD5Util.encrypt(MD5Util.encrypt(user.getUserPwd())));
        userMapper.insertSelective(user);
    }

    @Override
    public List<User> getUser(String phone) {
        UserExample ex = new UserExample();
        UserExample.Criteria criteria = ex.or();
        criteria.andUserPhoneEqualTo(phone);
        List<User> users = userMapper.selectByExample(ex);
        return users;
    }

    @Override
    public void updateUser(User user) {
        UserExample ex = new UserExample();
        UserExample.Criteria criteria = ex.or();
        criteria.andUserPhoneEqualTo(user.getUserPhone());
        userMapper.updateByExampleSelective(user,ex);
    }
}
