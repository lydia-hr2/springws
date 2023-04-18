package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository("pdao")// 빈 등록
public class ProductDAO implements MyDao<Integer, ProductDTO> {

    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Product:"+productDTO);
    }

    @Override
    public void delete(Integer i) {
        System.out.println("Deleted Product:"+i);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Product:"+productDTO);
    }

    @Override
    public ProductDTO select(Integer i) {
        ProductDTO product = null;
        product = new ProductDTO(i, "청바지", 35000, 5);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = null;
        list = new ArrayList();
        list.add(new ProductDTO(2, "면바지", 30000, 8 ));
        list.add(new ProductDTO(3, "와이셔츠", 25000, 30 ));
        list.add(new ProductDTO(4, "난닝구", 10000, 50 ));
        return list;
    }
}
