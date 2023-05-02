package com.springcore.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	
	public void study()
	{
		System.out.println("Student reading book.");
	}
}