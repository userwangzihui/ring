package com.j1902.shopping.service;


import com.j1902.shopping.model.Remember;
import com.j1902.shopping.pojo.Admin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

public interface AdminService {
    public boolean getByName(Remember admin);
    public Remember showPwd(HttpServletRequest request) throws UnsupportedEncodingException;
    public boolean rememberPwd(HttpServletResponse response, Remember remember) throws UnsupportedEncodingException;
    public boolean forgetPwd(HttpServletRequest request,HttpServletResponse response);

}
