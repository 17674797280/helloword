package com.yidu.ssmdemo007.dao;

import com.yidu.ssmdemo007.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProduDao {
    /**
     * 查询所有
     * @param pid
     * @return
     */

    public Product select(int pid);

    public int adds(Product product);



}
