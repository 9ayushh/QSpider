package com.assignment.a1.main;

import com.assignment.a1.model.Account;
import com.assignment.a1.model.Bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        Account a = (Account) con.getBean("account");
        System.out.println(a.getAccNo());
        System.out.println(a.getHolderName());
        System.out.println(a.getBalance());

        Bank b = a.getBank();
        System.out.println(b.getName());

    }
}
