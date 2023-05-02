package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		Person p = con.getBean("p1",Person.class);
		System.out.println(p);

	}

}
