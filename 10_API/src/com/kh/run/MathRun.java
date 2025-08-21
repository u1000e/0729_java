package com.kh.run;

// import java.lang.*;
// 복습을 합시다~~~~

public class MathRun extends Object {

	public static void main(String[] args) {
		
		// Java API
		
		// Math 클래스(수학)
		// Math math = new Math();
		/*
		 * - 모든 필드와 메소드가 전부 다 static
		 * - 객체를 생성할 필요가 없으므로 기본생성자의 접근제한자가 private
		 * - java.lang
		 */
		// 필드
		// 파이 => Math클래스 내에 상수필드로 정의되어있음
		System.out.println(Math.PI);
		
		// 메소드
		// 1. 제곱 => Math.pow()
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		// 2. 절대값 => Math.abs(int, double, long, float)
		System.out.println("절대값 : " + Math.abs(-33));
		
		double num = 8.141414;
		
		// 1. 올림 => Math.ceil(double) : double
		System.out.println("올림 : " + Math.ceil(num));
		
		// 2. 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num));
		
		// 3. 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num));
		
		
		

	}

}
