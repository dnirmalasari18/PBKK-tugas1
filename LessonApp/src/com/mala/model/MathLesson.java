package com.mala.model;

public class MathLesson implements Lesson {
	private String sub1;
	private int scoreSub1;
	
	public MathLesson() {
		
	}
	public MathLesson(String sub1, int scoreSub1) {
		this.sub1=sub1;
		this.scoreSub1=scoreSub1;
	}
	
	public String getSub1() {
		return this.sub1;
	}
	public void SetSub1(String Sub1) {
		this.sub1=Sub1;
	}
	public int getScoreSub1() {
		return this.scoreSub1;
	}
	public void SetScoreSub1(int ScoreSub1) {
		this.scoreSub1=ScoreSub1;
	}
	public String getInfo() {
		return "This is an important lesson";
	}
}
