package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.UserMapper;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.pojo.UserExample;
import com.j1902.shopping.service.UserService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {

        UserExample ue = new UserExample();
        //获取查询条件拼接工具
        UserExample.Criteria criteria = ue.or();
        //设置查询条件
        criteria.andUserPhoneEqualTo(user.getUserPhone());

        //执行查询
        List<User> users=userMapper.selectByExample(ue);

        if (users!=null&&users.size()>0){
            return user.getUserPwd().equals(users.get(0).getUserPwd());
        }
        return false;
    }

    @Override
    public void rememberPwd(User user, HttpServletResponse response) throws UnsupportedEncodingException {
        String jsonUser = JsonUtils.objectToJson(user);
        System.out.println("jsonUser1 = " + jsonUser);
        jsonUser = URLEncoder.encode(jsonUser,"UTF-8");
        System.out.println("jsonUser2 = " + jsonUser);
        Cookie cookie = new Cookie("REMEMBER_PASSWORD", jsonUser);
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);
    }

    @Override
    public void deleteCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies) {
                if("REMEMBER_PASSWORD".equals(cookie.getName())){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                } if("addCookie".equals(cookie.getName())){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }
    }

    @Override
    public void addCookie(String user, HttpServletResponse response) throws UnsupportedEncodingException {
        String jsonUser = JsonUtils.objectToJson(user);
        jsonUser = URLEncoder.encode(jsonUser,"UTF-8");
        System.out.println("jsonUser2 = " + jsonUser);
        Cookie cookie = new Cookie("addCookie", jsonUser);
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);
    }
}
