package com.assignment.a4.main;

import com.assignment.a4.model.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        Library l = (Library) con.getBean("library");


        System.out.println(l.getBooks());
    }
}
