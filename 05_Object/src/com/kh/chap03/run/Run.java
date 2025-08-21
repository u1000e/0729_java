package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		
		// Coffee라는 클래스(설계도)를 가지고 객체 생성
		Coffee coffee = new Coffee(); // <- 객체(Object) 생성        instance화
		// 1. 참조자료형 
		// 클래스를 만든다는 행위 == 사용자 정의 자료형을 만들겠다.
		// 2. 여러 개의 자료형에 여러 개의 값을 보관 + 기능
		// 3. 주소값을 저장
		System.out.println(coffee.info());
		// 기본값이 들어있음
		// => 정수 : 0, 실수 : 0.0, 참조형 : null, 문자 : '', boolean : false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피명이 뭔가요 > ");
		String name = sc.nextLine();
		coffee.setName(name);
		// String coffeeName = coffee.getName();
		System.out.print("원두는 어떤 원두인가요 > ");
		String bean = sc.nextLine();
		coffee.setBean(bean);
		System.out.print("사이즈는 어떤 사이즈인가요 > ");
		String size = sc.nextLine();
		coffee.setSize(size);
		System.out.print("가격을 얼마인가요 > ");
		int price = sc.nextInt();
		coffee.setPrice(price);
		
		String info = coffee.info();
		System.out.println("==========================");
		System.out.println(info);
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	

}
