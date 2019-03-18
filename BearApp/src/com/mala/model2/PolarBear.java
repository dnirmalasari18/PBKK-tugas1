package com.mala.model2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PolarBear implements Bear{
	
	private String bearColor;
	private float bearMass;
	KindOfFood food;
	public PolarBear() {
		
	}
	
	@Autowired
	public PolarBear(KindOfFood food) {
		this.food=food;
	}
	
	public String getBearColor() {
		return this.bearColor;
	}
	public void setBearColor(String bearColor) {
		this.bearColor=bearColor;
	}
	

	
	public float getBearMass() {
		return this.bearMass;
	}
	public void setBearMass(float bearMass) {
		this.bearMass=bearMass;
	}
	@Override
	public void bearType() {
		System.out.println("This is a polar bear");
	}
}
