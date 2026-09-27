package com.jsp.main;

import com.jsp.model.Clns;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        Clns c = (Clns) con.getBean("clns");

        System.out.println(c.getList());
        System.out.println(c.getSet());
        System.out.println(c.getMap());
        System.out.println(c.getAddress());
    }
}
