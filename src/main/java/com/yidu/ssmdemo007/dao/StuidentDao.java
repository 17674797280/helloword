package com.yidu.ssmdemo007.dao;

import com.yidu.ssmdemo007.bean.Stuident2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StuidentDao {


    public Stuident2 seleBid(Integer stuId);
}
