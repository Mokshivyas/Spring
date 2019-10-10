package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience 
{	
	@Pointcut("execution(* *.perform(..))") //..indicates any parameter *.perform() belongs to any object  *no matter what perform() returns
	//@Pointcut("execution(void *.perform(..)")
	//@Pointcut("execution(void com.zensar.spring.performers.Juggler.perform(..)")
	//@Pointcut("execution(public void com.zensar.spring.performers.Juggler.perform(..)")//if method is public than only it will work
	public void performancePointCut() 
	{
		
	}
	@Before("performancePointCut()")
	public void takeSeats() {
		System.out.println("Audience is taking their seats.");
	}
	
	@Before("execution(* *.perform(..))")
	public void switchOffCellPhones() {
		System.out.println("Audience is switching their phones.");
	}
	
	@AfterReturning("performancePointCut()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP!!");
	}
	@AfterThrowing("performancePointCut()")
	public void demandRefund() {
		System.out.println("Give me money back!");
	}
}
