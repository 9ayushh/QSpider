package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
//		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		// to use the close the connection (using the methods of connection) 		
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		Object obj = con.getBean("person"); // should be the same id ... as given in config
		
		Person p = (Person) obj;
		
		p.call();
		
		con.close();
	}
}
