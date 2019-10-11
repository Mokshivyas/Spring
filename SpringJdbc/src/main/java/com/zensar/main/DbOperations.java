package com.zensar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbOperations {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		
	
	}

}
