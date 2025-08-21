package com.kh.chap02.model.vo;

public class ItalyFood extends Food {
	
	// 필드부
	private int oil;
	
	// 생성자부
	public ItalyFood() {
		super();
	}
	
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		// this.foodName = foodName;
		// super.foodName = foodName;
		// 접근제한자가 private이기 때문에 안보임
		// 해결방법
		// 1. 부모클래스의 접근제한자를 바꿔버림
		// 캡슐화 원칙 X => 적합한 방법은 아님
		
		// 2. 부모클래스의 접근제한자 public인 setter메소드를 호출
		/*
		super.setFoodName(foodName);
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		// 3. 부모클래스가 가지고 있는 매개변수 생성자를 호출
		super(foodName, material, cookingTime);
		this.oil = oil;
	}
	
	// 메소드부
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	

}
