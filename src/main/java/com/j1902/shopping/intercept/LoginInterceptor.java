package com.j1902.shopping.intercept;


import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Controller
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getRequestURI();
        System.out.println("path = " + path);
        if (!doLoginInterceptor(path)){
            System.out.println("aaaaaaa");
            return true;
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_LOGIN");
        Admin admin = (Admin) session.getAttribute("ADMIN_LOGIN");
        if (admin!=null){
            return true;
        }
        if (user==null){
            System.out.println("111111");
            String requestType = request.getHeader("X-Requested-With");
            if (requestType!=null&&requestType.equals("XMLHttpRequst")){
                System.out.println("2222222");
                response.setHeader("sessionstatus","timrout");
                response.getWriter().print("登录失效！！！");
                return false;
            }else{
                System.out.println("333333333");
                response.sendRedirect(request.getContextPath()+"/frontLogin");
            }
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private boolean doLoginInterceptor(String path) {
        Set<String> noLoginInterceptor = new HashSet<>();
        noLoginInterceptor.add("/index");
        noLoginInterceptor.add("/ItemPrice");
        noLoginInterceptor.add("/getItemAll");
        noLoginInterceptor.add("/getBySeries");
        noLoginInterceptor.add("/logins");
        noLoginInterceptor.add("/log");
        noLoginInterceptor.add("/frontLogin");
        noLoginInterceptor.add("/register");
        noLoginInterceptor.add("/yzm");
        noLoginInterceptor.add("/registers");
        noLoginInterceptor.add("/forgets");
        noLoginInterceptor.add("/detail");
        noLoginInterceptor.add("/AdminLogin");
        noLoginInterceptor.add("/404");
        noLoginInterceptor.add("/400");
        noLoginInterceptor.add("/500");
        noLoginInterceptor.add("/error");
        if (noLoginInterceptor.contains(path)) {
            return false;
        } else {
            return true;
        }
    }
}
