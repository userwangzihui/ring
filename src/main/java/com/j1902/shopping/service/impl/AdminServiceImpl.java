package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.AdminMapper;
import com.j1902.shopping.model.Remember;
import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.AdminExample;
import com.j1902.shopping.service.AdminService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminmapp;

    @Override
    public boolean getByName(Remember admin) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.or();
        criteria.andAdminNameEqualTo(admin.getAdminName());
        List<Admin> admins = adminmapp.selectByExample(adminExample);
        if (admins != null && admins.size() > 0) {
            return admins.get(0).getAdminPwd().equals(admin.getAdminPwd());
        }
        return false;
    }
    @Override
    public Remember showPwd(HttpServletRequest request) throws UnsupportedEncodingException {
        Cookie[] cookies = request.getCookies();
        Remember cookAdmin = null;
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                if ("AUTO_LOGIN_ADMIN_INFO".equals(c.getName())) {
                    String userJson = c.getValue();
                    userJson = URLDecoder.decode(userJson, "UTF-8");
                    cookAdmin = JsonUtils.jsonToPojo(userJson, Remember.class);
                }
            }
        }
        return cookAdmin;
    }

    @Override
    public boolean rememberPwd(HttpServletResponse response, Remember remember) throws UnsupportedEncodingException {
        String userJson = JsonUtils.objectToJson(remember);
        Cookie cookie = new Cookie("AUTO_LOGIN_ADMIN_INFO", URLEncoder.encode(userJson, "UTF-8"));
        cookie.setMaxAge(3600 * 24 * 30);
        response.addCookie(cookie);
        return true;
    }

    @Override
    public boolean forgetPwd(HttpServletRequest request,HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies!=null&&cookies.length>0){
            for (Cookie cookie : cookies) {
                if ("AUTO_LOGIN_ADMIN_INFO".equals(cookie.getName())){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }
        return false;
    }
}
