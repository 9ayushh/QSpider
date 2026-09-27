package com.assignment.a2.main;

import com.assignment.a2.model.Product;
import com.assignment.a2.model.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        Product p = (Product) con.getBean("product");
        System.out.println(p.getProdId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());

        ShoppingCart s = p.getQuantity();
        int quantity = s.getQuantity();
        System.out.println(quantity);

        System.out.println(p.total(p.getPrice(), quantity));


    }
}
