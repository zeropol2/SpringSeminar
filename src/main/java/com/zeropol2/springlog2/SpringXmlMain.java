package com.zeropol2.springlog2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringXmlMain {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new GenericXmlApplicationContext("com/zeropol2/springlog2/applicationContext.xml");
		Client client = (Client)factory.getBean("Client");
		
		client.biz();
	}
}
