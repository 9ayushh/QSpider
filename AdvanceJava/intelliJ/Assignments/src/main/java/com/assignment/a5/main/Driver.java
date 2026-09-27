package com.assignment.a5.main;

import com.assignment.a5.model.College;
import com.assignment.a5.model.Principal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        College c = (College) con.getBean("college");

        System.out.println(c.getCollegeName());
        Principal p = c.getPrincyName();
        System.out.println(p.getName());
        System.out.println(c.getStudents());
    }
}
