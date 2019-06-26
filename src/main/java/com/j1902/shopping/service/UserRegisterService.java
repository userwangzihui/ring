package com.j1902.shopping.service;

import com.j1902.shopping.pojo.User;

import java.util.List;

public interface UserRegisterService {
    public void setUser(User user);
    public List<User> getUser(String phone);
    public void updateUser(User user);
}
