package com.j1902.shopping.controller;

import com.aliyuncs.exceptions.ClientException;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.service.UserRegisterService;
import com.j1902.shopping.utils.RandomCreatUtil;
import com.j1902.shopping.utils.SendTelSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RegisterController {
    @Autowired
    private UserRegisterService userService;

    @RequestMapping("register")
    public String register(User user) {
        System.out.println("user = " + user.toString());
         userService.setUser(user);
        return "front/login";
    }
    @RequestMapping("yzm")
    @ResponseBody
    public String yZM(String phone) throws ClientException {
        System.out.println("phone = " + phone);

        String s = RandomCreatUtil.codeCreate(4);
        SendTelSms.sendSms(phone,s);
        return s;
    }
    @RequestMapping("/registers")
    public  String registers(){
        return "front/register";
    }
    @RequestMapping("/existPhone")
    @ResponseBody
    public  String existPhone(String phone){
       System.out.println("p = " + phone);

        List<User> user = userService.getUser(phone);

        if (user.size()>0) {
            return "1";
        }
        return null;
    }
    @RequestMapping("forgets")
    public String forgets(User user){
      userService.updateUser(user);
        return "front/login";
    }
}
