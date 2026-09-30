package com.jsp.main;

import com.jsp.config.Config;
import com.jsp.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);

        User user = (User) con.getBean("user");
        System.out.println(user);
    }
}
