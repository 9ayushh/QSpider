package com.jsp.main;

import com.jsp.model.Address;
import com.jsp.model.Employee;
import com.jsp.model.Person;
import com.jsp.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        Student s = (Student) con.getBean("student");
//        System.out.println(s.getRoll());
//        System.out.println(s.getName());
//        System.out.println(s.getCgpa());
//        System.out.println(s.getPhone());

        Employee emp = (Employee) con.getBean("employee");
//        System.out.println(emp.getEmpId());
//        System.out.println(emp.getName());
//        System.out.println(emp.getDept());

        Person p = (Person) con.getBean("person");
        System.out.println(p.getId());
        System.out.println(p.getName());
        Address a = p.getAddress();
        System.out.println(a.getHno());
        System.out.println(a.getCity());
        System.out.println(a.getPincode());



    }
}
