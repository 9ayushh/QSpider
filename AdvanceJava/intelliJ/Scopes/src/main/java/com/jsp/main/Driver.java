package com.jsp.main;

import com.jsp.config.Config;
import com.jsp.model.Person;
import com.jsp.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);

//        User user = (User) con.getBean("user");
//        user.setVal(6);
//        System.out.println(user.getVal());
//
//
//        User user1 = (User) con.getBean("user");
//        System.out.println(user1.getVal());

        Person p = (Person) con.getBean("person");
        System.out.println(p.getName());
        System.out.println(p.getEmail());
        System.out.println(p.getPhone());
        System.out.println(p.getPassword());

    }
}
