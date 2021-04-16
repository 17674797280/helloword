package com.yidu.ssmdemo007.service;

import com.yidu.ssmdemo007.bean.UserInfo;
import com.yidu.ssmdemo007.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserInfo logi(String username,String userpass){
        return  userDao.logins(username,userpass);
    }

    public  int  add(UserInfo userInfo){
        return  userDao.insert(userInfo);
    }
}
