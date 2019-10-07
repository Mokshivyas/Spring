package com.zensar.spring;

public class FestivalGreeting implements Greeting {

	@Override
	public String greet()
	{
		// TODO Auto-generated method stub
		return "Happy Dushhera Mokshi!!";
	}
	
	public FestivalGreeting() 
	{
	System.out.println("Festival Greeting is created");
	}
}
