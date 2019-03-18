package com.mala.model2;

import org.springframework.stereotype.Component;

@Component
public class KindOfFood {
	private String foodInfo;
	
	public KindOfFood() {
		
	}
	
	public String getFoodInfo() {
		return this.foodInfo;
	}
	public void setFoodInfo(String foodInfo) {
		this.foodInfo=foodInfo;
	}
}
