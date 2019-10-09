package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("sayanti",Performer.class);
		p.perform();
	
		Performer p1 = ctx.getBean("mokshi",Performer.class);
		p1.perform();
		
		Performer p2 = ctx.getBean("arya",Performer.class);
		p2.perform();
		
	}

}
