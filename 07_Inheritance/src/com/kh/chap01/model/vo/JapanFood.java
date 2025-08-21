package com.kh.chap01.model.vo;

public class JapanFood {
	
	private String foodName;
	private String material;
	private int cookingTime;
	private int fresh;
	
	public JapanFood() {}
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.fresh = fresh;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public String getMaterial() {
		return material;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	public int getFresh() {
		return fresh;
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
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	public String information() {
		return "음식정보 [음식명 : " + foodName
			  +", 재료 : " + material
			  +", 조리시간 : " + cookingTime
			  +", 신선도 : " + fresh + "]";
	}

}
