package com.yidu.ssmdemo007.dao;

import com.yidu.ssmdemo007.bean.Menuinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuinfoDao {

    /**
     * 查询所有
     */
    public List<Menuinfo> selectAll();

    /**
     * 新增
     */
    public int insert(Menuinfo menuinfo);

    /**
     * 删除
     */
    public int deleteById(String menuid);
}
