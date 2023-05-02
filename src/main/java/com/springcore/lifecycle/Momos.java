package com.springcore.lifecycle;
// Using inti and destory method
public class Momos {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Momos() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Momos [price=" + price + "]";
	}
	
	public void inti()
	{
		System.out.println("init method");
	}
	public void destroy()
	{
		System.out.println("destroy method");
	}

}
