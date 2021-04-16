package com.yidu.ssmdemo007.controller;

import com.yidu.ssmdemo007.bean.UserInfo;
import com.yidu.ssmdemo007.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserCotroller {
    @Autowired
    UserService userService;


    @RequestMapping("logins")
    @ResponseBody
    public   UserInfo  login(String username, String userpass){
        System.out.println("userName = " + username + ", userpass = " + userpass);
        //调用数据库登陆查询方法
        return  userService.logi(username,userpass);

        //return "登陆成功！userName = " + userName + ", userpass = " + userpass ;
    }
    @RequestMapping("add")
    @ResponseBody
    public  int add(UserInfo userInfo){
        System.out.println("userInfo = " + userInfo);

        return  userService.add(userInfo);
    }

    @RequestMapping("hello")
    public  String hello(){
        return  "long";
    }

   /* @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(HttpServletRequest request){
        //调用数据库方法得到用户数据

        //将数据存入数据库

        //跳转到指定页面，显示数据
        return "UserInfo";
    }*/
}
