package com.yidu.ssmdemo007.service;

import com.yidu.ssmdemo007.bean.Stuident2;
import com.yidu.ssmdemo007.dao.StuidentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stuident2Service {

    @Autowired
    StuidentDao stuideDao;

    public Stuident2 select(int stuId ){

        return  stuideDao.seleBid(stuId);
    }


}
