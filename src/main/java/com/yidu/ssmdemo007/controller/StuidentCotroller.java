package com.yidu.ssmdemo007.controller;

import com.yidu.ssmdemo007.bean.Stuident2;
import com.yidu.ssmdemo007.service.Stuident2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuidentCotroller {

    @Autowired
    Stuident2Service stuident2Service;

    @RequestMapping("seleBid")
    @ResponseBody
    public String seleBid(int stuId) {
        Stuident2 stuident2 = stuident2Service.select(stuId);
        if (stuident2 != null) {
            return "结果"+stuident2;
        }else{
            return "没有这个角色";
        }
    }



    }
