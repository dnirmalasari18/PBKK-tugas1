package com.mala.main;

import com.mala.model.Fish;
import com.mala.model.PufferFish;
import com.mala.model.AnglerFish;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:fishBean.xml");
		
		Fish fish1= context.getBean("AnAnglerFish",Fish.class);
		fish1.fishType();
		
		AnglerFish angler=(AnglerFish)fish1;
		System.out.println("Code\t\t: " + angler.getFishCode());
		System.out.println("Scientific Name\t: " + angler.getFishScientificName());
		System.out.println("Mass\t\t: " + angler.getFishMass());
		System.out.println("Length\t\t: " + angler.getFishLength());
		System.out.println("Gender\t\t: " + angler.getFishGender());
		
		System.out.println("\n\n\n");
		Fish fish2= context.getBean("APufferFish",Fish.class);
		fish2.fishType();
		PufferFish puff=(PufferFish)fish2;
		System.out.println("Code\t\t: " + puff.getFishCode());
		System.out.println("Scientific Name\t: " + puff.getFishScientificName());
		System.out.println("Mass\t\t: " + puff.getFishMass());
		System.out.println("Length\t\t: " + puff.getFishLength());
		System.out.println("Gender\t\t: " + puff.getFishGender());
		
		context.close();		
	}
}
