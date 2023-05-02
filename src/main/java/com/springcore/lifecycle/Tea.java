package com.springcore.lifecycle;
//using interface initializing and desposablebean
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tea implements InitializingBean , DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tea [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Drinking tea....");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy......");
	}
	
	

}
