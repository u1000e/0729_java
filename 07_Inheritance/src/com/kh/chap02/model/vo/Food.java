package com.kh.chap02.model.vo;
/*
 * 상속(Inheritance)
 * 
 * 기존의 클래스를 이용해서 새로운 클래스를 만드는 기술 == 상속
 * 
 * 매 클래스마다 중복된 필드, 메소드들을 하나의 클래스로
 * 정의해둔 후 해당 클래스의 멤버를 가져다 사용하는 개념
 */
public class Food extends Object {
	
	// 공통적으로 가지고 있던 필드
	// 필드부 : foodName, material, cookingTime
	protected String foodName;
	private String material;
	private int cookingTime;
	
	// 생성자부
	public Food() {
		System.out.println("안녕하세요 부모입니다.");
	}
	public Food(String foodName, String material, int cookingTime) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
	}
	
	// 메소드부
	public String getFoodName() {
		return foodName;
	}
	public String getMaterial() {
		return material;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	public String information() {
		return "음식명 : " + foodName + ", 주재료 : " + material
		     + ", 조리시간 : " + cookingTime;
	}
	

}
