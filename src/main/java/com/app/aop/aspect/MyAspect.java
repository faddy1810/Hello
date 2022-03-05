package com.app.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect
{
@Before("execution(* com.app.services.PaymentServiceImpl.welcome())")
public void printBefore()
{
	System.out.println("Payment Started...!!!");
}
@After("execution(* com.app.services.PaymentServiceImpl.getmethod())")
public void printAfter()
{
	System.out.println("Payment COMPLETED...!!!");
}
}
