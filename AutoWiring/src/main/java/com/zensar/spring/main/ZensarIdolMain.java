package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.config.PerformerConfig;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p = ctx.getBean("sayanti",Performer.class);
		p.perform();
	
		
	}

}
