package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspects {
//	@Before("execution (public  void  recharge())")
//	public void beforeMsg() {
//		System.out.println("YOUR RECHARGE EXPIRING SOON...PLZ RECHARGE..!");	
//	}
//	
//	@After("execution(public void recharge())")
//	public void afterMsg() {
//		System.out.println("ENGOY YOUR DATA PACK..");
//	}
	@Around("execution(* com.tka.entity.MobileRecharge.*())")
	public void aroundMSG(ProceedingJoinPoint pj)  {
		System.out.println("YOUR RECHARGE EXPIRING SOON...PLZ RECHARGE..!");
		try {
			pj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ENGOY YOUR DATA PACK..");
	}
	

}
