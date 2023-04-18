package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;

import java.util.List;

public class ProductService implements MyService<Integer, ProductDTO> {

    MyDao<Integer, ProductDTO> dao;
    public ProductService(MyDao dao){
        this.dao = dao;
    }
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
    public ProductDTO get(Integer i) {
        return dao.select(i);
    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}