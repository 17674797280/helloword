package com.yidu.ssmdemo007.service;

import com.yidu.ssmdemo007.bean.Product;
import com.yidu.ssmdemo007.dao.ProduDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProduDao produDao;

    public Product select(int pid){

        return produDao.select(pid);
    }

    public  int adds(Product product){
        return  produDao.adds(product);
    }
}
