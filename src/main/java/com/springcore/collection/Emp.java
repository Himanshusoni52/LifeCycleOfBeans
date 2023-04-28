package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String name;
	private List<String>phones;
	private Set<String>address;
	private Map<String ,String> coureses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCoureses() {
		return coureses;
	}
	public void setCoureses(Map<String, String> coureses) {
		this.coureses = coureses;
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> coureses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.coureses = coureses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
