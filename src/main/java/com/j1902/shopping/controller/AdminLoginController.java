package com.j1902.shopping.controller;

import com.j1902.shopping.model.Remember;
import com.j1902.shopping.model.Result;
import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.service.AdminService;
import com.j1902.shopping.utils.JsonUtils;
import org.apache.solr.client.solrj.cloud.autoscaling.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class AdminLoginController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/adminLogin")
    @ResponseBody
    public Result adminLogin(Remember remember, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        System.out.println("remember = " + remember);
        Admin admin = new Admin();
        admin.setAdminName(remember.getAdminName());
        admin.setAdminPwd(remember.getAdminPwd());
        System.out.println("admin = " + admin);
        Result result = new Result();
     if (adminService.getByName(admin)){
         if ("true".equals(remember.getRemember())){
             System.out.println(111111);
             String userJson = JsonUtils.objectToJson(admin);
             Cookie cookie = new Cookie("AUTO_LOGIN_ADMIN_INFO", URLEncoder.encode(userJson,"UTF-8"));
             cookie.setMaxAge(3600*24*30);
            response.addCookie(cookie);
         }
         result.setState(true);
         HttpSession session = request.getSession();
         session.setAttribute("ADMIN_LOGIN",admin);


         return result;
     }
     result.setState(false);
       return result;

    }
}
