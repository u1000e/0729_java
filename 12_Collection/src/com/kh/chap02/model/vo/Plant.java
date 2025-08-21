package com.kh.chap02.model.vo;

public class Plant {
	
	private String type;
	private String name;
	 
	public Plant() {}
	public Plant(String type, String name) {
		this.type = type;
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "식물정보 [이름 = " + name + ", 종류 = " + type +  "]";
	}

}
