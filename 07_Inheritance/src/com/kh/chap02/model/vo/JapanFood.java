package com.kh.chap02.model.vo;

//			 자식클래스 extends 부모클래스
public class JapanFood extends Food {
	
	// 필드부
	// 부모로부터 상속받은 부분은 기술하지 않는다!
	private int fresh;
	
	// 생성자부
	public JapanFood() {}
	
	// 매개변수 생성자
	// foodName, material, cookingTime : 부모클래스의 필드에 대입해야함
	// fresh : 내 필드에 대입
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		super(foodName, material, cookingTime);
		this.fresh = fresh;
	}
	
	// 메소드부
	public int getFresh() {
		return fresh;
	}
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// 메소드를 상속받았는데 마음에 안들어 발전시키고 싶어
	// 다시 쓸 수 있음 ==> 재정의
	public String information() {
		/*
		return "음식명 : " + super.getFoodName()
		     + ", 주재료 : " + super.getMaterial()
		     + ", 조리시간 : " + super.getCookingTime()
		     + ", 신선도 : " + fresh;
		*/
		return super.information() + ", 신선도 : " + fresh;
	}
	
	
	

}
