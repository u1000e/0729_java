package com.kh.chap02.run;

import com.kh.chap02.model.vo.ItalyFood;
import com.kh.chap02.model.vo.JapanFood;
import com.kh.chap02.model.vo.KoreaFood;

public class Run {

	public static void main(String[] args) {
		
		KoreaFood kf = new KoreaFood();
		kf.setFoodName("비빔밥");
		System.out.println(kf.getFoodName());
		
		// 호출을 하는 메소드가 해당 클래스에 존재하지 않는다면
		// 자동으로 해당 클래스의 부모클래스에 있는 메소드를 호출
		
		ItalyFood yf = new ItalyFood("기름파스타", "기름", 15, 5);
		// yf.foodName = "여기서도";
		System.out.println(yf.information());
		
		JapanFood jf = new JapanFood("스시", "밥", 20, 5);
		System.out.println(jf.information());
		
		// 자식클래스에 메소드를 재정의 했을 경우
		// 자식클래스에 존재하는 메소드가 우선권을 가져서 호출됨! ☆★☆★☆★☆★☆★☆★
		
		
		/*
		 * 상속
		 * 
		 * - 중복된 코드를 공통으로 관리
		 * => 보다 적은양의 코드로 새로운 클래스를 만들 수 있음
		 * 
		 * => 생산성 향상, 가독성 향상
		 * 
		 * 객체간의 결합도가 높아짐
		 * 
		 * 
		 * 상속의 특징
		 * 
		 * - 클래스간의 다중상속은 불가능하다(단일 상속만 가능)
		 * 
		 * - 명시되어있지는 않지만 모든 클래스는 Object클래스의 후손클래스
		 *   (내가 만든 클래스, 자바에서 원래 제공하는 클래스)
		 *   
		 * => Object클래스에 있는 멤버를 사용할 수 있음
		 * => Object클래스에 있는 메소드가 마음에 안든다면 재정의를 할 수 있음
		 */
		
	}
	
	
	
	
	
	
	
	
	
	

}
