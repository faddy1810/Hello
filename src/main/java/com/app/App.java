package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.services.PaymentService;
import com.app.services.PaymentServiceImpl;

public class App 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PaymentService obj=context.getBean("payment",PaymentService.class);
		obj.welcome();
		obj.getmethod();
		
		
		

	}

}
