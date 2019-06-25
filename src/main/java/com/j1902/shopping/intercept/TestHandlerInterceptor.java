package com.j1902.shopping.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    /*    System.out.println("TestHandlerInterceptor.preHandle");
        String contextPath = request.getContextPath();
        System.out.println("contextPath = " + contextPath);
        System.out.println("这个是："+handler);
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("TestHandlerInterceptor.postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("TestHandlerInterceptor.afterCompletion");
    }
}
