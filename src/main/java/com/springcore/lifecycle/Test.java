package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		
		Momos momos = (Momos) context.getBean("m1");
		System.out.println(momos);
		
		Tea tea =(Tea) context.getBean("t1");
		System.out.println(tea);
		
		Anno anno = (Anno) context.getBean("a1");
		System.out.println(anno);
	}

}
