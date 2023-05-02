package com.springcore.lifecycle;
//using @postconstruct and @perdestroy annotation
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Anno {
	private String Mob;

	public String getMob() {
		return Mob;
	}

	public void setMob(String mob) {
		Mob = mob;
	}

	public Anno() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Anno [Mob=" + Mob + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Starting...");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Ending...");
	}

}
