package com.yidu.ssmdemo007.service;

import com.yidu.ssmdemo007.bean.Menuinfo;
import com.yidu.ssmdemo007.dao.MenuinfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuinfoServlet {
    @Autowired
    MenuinfoDao menuinfoDao;


    public List<Menuinfo> selectAll(){
        return menuinfoDao.selectAll();
    }

    public  int insert(Menuinfo menuinfo){
        return  menuinfoDao.insert(menuinfo);
    }

    public int deleteById(String menuid){
        return menuinfoDao.deleteById(menuid);
    }

    public int updata(Menuinfo menuinfo){return menuinfoDao.updata(menuinfo);}

    public Menuinfo selectOne(String menuid){ return menuinfoDao.selectOne(menuid);}


}
