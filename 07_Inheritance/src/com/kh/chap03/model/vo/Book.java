package com.kh.chap03.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	
	public Book() {}
	public Book(String title, String publisher, String author, int price) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "책정보 [책 제목 : " + title
			  +", 출판사 : " + publisher
			  +", 저자 : " + author
			  +", 가격 : " + price + "]";
	}
	

}
