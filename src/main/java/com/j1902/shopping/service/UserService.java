package com.j1902.shopping.service;

import com.j1902.shopping.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

public interface UserService {

    public boolean login(User user);

    public void  rememberPwd(User user, HttpServletResponse response) throws UnsupportedEncodingException;

    public void deleteCookie(HttpServletRequest request, HttpServletResponse response);

    public void addCookie(String user, HttpServletResponse response) throws UnsupportedEncodingException;
    public List<User> getByPhone(User user);
    public boolean getByUserName(String userName);
}
