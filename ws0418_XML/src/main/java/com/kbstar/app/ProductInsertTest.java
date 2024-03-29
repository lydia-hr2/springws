package com.kbstar.app;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductInsertTest {
    public static void main(String[] args) {

        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");
        MyService<Integer, ProductDTO> service =
                (MyService<Integer, ProductDTO>) factory.getBean("pservice");

        ProductDTO u = new ProductDTO(6, "가디건", 55000, 5);
        service.register(u);

    }}