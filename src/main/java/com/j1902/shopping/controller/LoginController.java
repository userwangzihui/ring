package com.j1902.shopping.controller;

import com.j1902.shopping.pojo.User;
import com.j1902.shopping.service.UserService;
import com.j1902.shopping.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
//前端登录
    @RequestMapping("/frontLogin")
    public String login(HttpServletRequest request, Map<String, Object> map, HttpServletResponse response) throws UnsupportedEncodingException {
        Cookie[] cookies = request.getCookies();
        User cookUser = null;
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                if ("REMEMBER_PASSWORD".equals(c.getName())) {
                    String userJson = c.getValue();
                    userJson = URLDecoder.decode(userJson, "UTF-8");
                    cookUser = JsonUtils.jsonToPojo(userJson, User.class);
                    map.put("phone", cookUser.getUserPhone());
                    map.put("password", cookUser.getUserPwd());

                }
                if ("addCookie".equals(c.getName())) {
                    userService.deleteCookie(request, response);
                    return "front/login";
                }
            }
        }
        return "front/login";
    }
//记住密码勾选框
    @RequestMapping("/log")
    @ResponseBody
    public Map<String, Object> log(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        Cookie[] cookies = request.getCookies();
        User cookUser = null;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("REMEMBER_PASSWORD".equals(cookie.getName())) {
                    map.put("is", 1);
                    return map;
                } else if ("addCookie".equals(cookie.getName())) {
                    map.put("is", 1);
                    return map;
                }
            }
        }
        return null;
    }

    @RequestMapping("/logins")
    public String login(User user, HttpServletRequest request, HttpServletResponse response, Map<String, Object> map, HttpSession session) throws UnsupportedEncodingException {
        String userphone = request.getParameter("userphone");
        String rememberPassword = request.getParameter("rememberPassword");
        System.out.println("rememberPassword = " + rememberPassword);
        System.out.println("user = " + user.toString());
        if (userService.login(user)) {
            if ("true".equals(rememberPassword)) {
                userService.rememberPwd(user, response);
            } else {
                userService.deleteCookie(request, response);
            }
            List<User> users = userService.getByPhone(user);
            session.setAttribute("USER_LOGIN",users.get(0));
           return "front/member_info";
        } else if ("true".equals(rememberPassword)) {
            userService.addCookie(user.getUserPhone(), response);
            map.put("phone", user.getUserPhone());
            map.put("loginFail", "用户名与密码不匹配！");
            return "front/login";
        }

        map.put("phone", user.getUserPhone());
        map.put("loginFail", "用户名与密码不匹配！");
        return "front/login";
    }

}
