package com.kh.chap03.model.vo;

public class ElectronicBook extends Book {
	
	private String platform;
	
	public ElectronicBook() {}
	public ElectronicBook(String title, String publisher, 
					      String author, int price,
					      String platform) {
		super(title, publisher, author, price);
		this.platform = platform;
	}
	
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String information() {
		return super.information() + ", 플랫폼 : " + platform + "]";
	}
	
	public String toString() {
		return super.information() + ", 플랫폼 : " + platform + "]";
	}
	

}
