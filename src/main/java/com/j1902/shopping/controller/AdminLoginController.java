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
import java.util.Map;

@Controller
public class AdminLoginController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/adminLogin")
    public String adminLogin(Remember remember, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        System.out.println("remember = " + remember);
        if (adminService.getByName(remember)) {
            if ("on".equals(remember.getRemember())) {
                adminService.rememberPwd(response, remember);
            } else {
                adminService.forgetPwd(request, response);
            }
            session.setAttribute("ADMIN_LOGIN", remember);
            return "redirect:order";
        } else {
            adminService.forgetPwd(request, response);
            session.setAttribute("adminName", remember.getAdminName());
            session.setAttribute("one", "ok");
            if ("on".equals(remember.getRemember())) {
                session.setAttribute("to", "ok");
                session.setAttribute("adminRemember", remember.getRemember());
            }
            return "redirect:AdminLogin";
        }

    }
}
