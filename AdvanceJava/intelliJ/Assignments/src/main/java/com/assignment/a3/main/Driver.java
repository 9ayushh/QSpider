package com.assignment.a3.main;

import com.assignment.a3.model.Customer;
import com.assignment.a3.model.FoodItem;
import com.assignment.a3.model.Order;
import com.assignment.a3.model.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        Order o = (Order) con.getBean("order");

        Customer cus = o.getCustomer();
        Restaurant res = o.getRestaurant();

        System.out.println(cus.getName());
        System.out.println(res.getRestName());
        List<FoodItem> f = o.getItems();
        int price = 0;
        for(int i=0; i<2; i++){
            FoodItem fi = f.get(i);
            System.out.println(fi.getFoodName());
            price += fi.getFoodPrice();
        }
        o.setTotalPrice(price);
        System.out.println(o.getTotalPrice());

    }
}
