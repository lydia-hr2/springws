package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("pservice")
public class ProductService implements MyService<Integer, ProductDTO> {
    @Autowired// @Autowired 어노테이션 추가
    ProductDAO dao;


    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("register. send mail!");
    }

    @Override
    public void remove(Integer i) {
        dao.delete(i);
        System.out.println("remove. send mail!");
    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
        System.out.println("modify. send mail!");
    }

    @Override
    public ProductDTO select(Integer i) {
        return dao.select(i);
    }

    @Override
    public List<ProductDTO> select() {
        return dao.select();
    }

}
