package com.kh.chap01.run;

import com.kh.chap01.controller.Integers;

public class Run {

	public static void main(String[] args) {
		
		// 정수 값을 여러 개 다루고 싶음 정확하게 몇 개의 정수를 다룰지 알 수 없음
		/*
		int[] integers = new int[3];
		integers[0] = 1;
		integers[1] = 5;
		integers[2] = 6;
		integers = new int[5];
		*/
		
		Integers integers = new Integers();
		integers.add(10);
		integers.add(30);
		integers.add(30);
		integers.add(60);
		integers.add(60);
		integers.add(60);
		integers.add(20);
		
		int element = integers.get(2);
		integers.get(10);
		System.out.println(element);
		
		System.out.println(integers);
	}
	
	
	

}
