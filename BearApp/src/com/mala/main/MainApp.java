package com.mala.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mala.model2.*;
public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bearBean.xml");
		Bear bear1=context.getBean("polarBear", Bear.class);
		PolarBear polar=(PolarBear) bear1;
		
		Bear bear2=context.getBean("panda",Bear.class);
		Panda panda=(Panda)bear2;
		
		System.out.println("No error");
		context.close();
	}
}
