package com.mala.model2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Panda implements Bear {
	
	private String bearColor;
	private float bearMass;
	KindOfFood food;
	public Panda() {}
	@Autowired
	public Panda(KindOfFood food) {
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
		System.out.println("This is a panda");
	}
}
