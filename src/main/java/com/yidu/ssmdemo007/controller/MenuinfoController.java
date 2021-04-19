package com.yidu.ssmdemo007.controller;

import com.yidu.ssmdemo007.bean.Menuinfo;
import com.yidu.ssmdemo007.bean.Product;
import com.yidu.ssmdemo007.service.MenuinfoServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MenuinfoController {

    @Autowired
    MenuinfoServlet menuinfoServlet;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public List<Menuinfo> selectAll(){
        return menuinfoServlet.selectAll();
    }
    /**
     * 新增
     * @return
     */
    @RequestMapping("insert")
    @ResponseBody
    public int insert(Menuinfo menuinfo){
        /*System.out.println(menuinfo);*/
        return menuinfoServlet.insert(menuinfo);
    }
    /**
     * 删除
     * @return
     */
    @RequestMapping("deleteById")
    @ResponseBody
    public int deleteById(String menuid){
        return menuinfoServlet.deleteById(menuid);
    }


    @RequestMapping("selectAll1")
    public String selectAll(HttpServletRequest request){

        //调用数据库方法得到用户数据
        List<Menuinfo> menuinfos = menuinfoServlet.selectAll();
        //将数据存入数据库
        request.setAttribute("menuList",menuinfos);
        //跳转到指定页面，显示数据
        return "menuinfo";
    }
    /**
     * 修改
     * @return
     */
    @ResponseBody
    @RequestMapping("selectOne")
    public Menuinfo selectOne(String menuid){
        //调用数据库方法得到用户数据
        Menuinfo menuinfo = menuinfoServlet.selectOne(menuid);
        //跳转到指定页面，显示数据
        return menuinfo;
    }
    @RequestMapping("updata")
    public String updata(Menuinfo menuinfos){
        //调用数据库方法得到用户数据
        int i= menuinfoServlet.updata(menuinfos);
        //跳转到指定页面，显示数据
        return "forward:selectAll1";
    }
}
