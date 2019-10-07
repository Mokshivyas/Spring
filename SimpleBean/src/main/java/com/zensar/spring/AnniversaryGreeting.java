package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary!";
		
	}
public AnniversaryGreeting() {
	System.out.println("Anniversary greeting is created!");
}
}
