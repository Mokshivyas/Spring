package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("ram")
public class Juggler implements Performer {
	@Value("4")
	private int beanBags;
	
	@Override
	public void perform() throws PerformanceException {
		if(beanBags <3) 
		{
			throw new PerformanceException("Number of bean bags not sufficient " +beanBags);
		}
		else
		{
			System.out.println("Juggler juggling bean bags");
		}

	}

}
