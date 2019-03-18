package com.mala.model;
public class PufferFish implements Fish{
	private String fishScientificName;
	private String fishCode;
	private float fishMass;
	private int fishLength;
	private String fishGender;
	
	public PufferFish() {
		this.fishScientificName="Tetraodontidae";
	}
	
	public PufferFish(String fishCode, int fishMass, int fishLength, String fishGender) {
		super();
		this.fishCode=fishCode;
		this.fishMass=fishMass;
		this.fishLength=fishLength;
		this.fishGender=fishGender;
	}
	
	public String getFishScientificName() {
		return this.fishScientificName;
	}
	
	public String getFishCode() {
		return this.fishCode;
	}
	public void setFishCode(String fishCode) {
		this.fishCode=fishCode;
	}
	
	public float getFishMass() {
		return this.fishMass;
	}
	public void setFishMass(float fishMass) {
		this.fishMass=fishMass;
	}
	
	public int getFishLength() {
		return this.fishLength;
	}
	public void setFishLength(int fishLength) {
		this.fishLength=fishLength;
	}
	
	public String getFishGender() {
		return this.fishGender;
	}
	public void setFishGender(String fishGender) {
		this.fishGender=fishGender;
	}
	
	@Override
	public void showFishInfo() {
		System.out.println(this.toString());
	}
	
	public void fishType() {
		System.out.println("This is an puffer fish");
	}
}
