package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {
	
	// 캡슐화 (encapsulation)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	
	// 접근제한자 (예약어) 반환형 메소드식별자(매개변수){    }
	public static void main(String[] args) {
	
		// 변수 선언    대입연산자   객체 생성 == 메모리에 적재
		Cafe cafe = new Cafe();
		
		/*
		cafe.lee;
		cafe.name = "KH카페";
		System.out.println(cafe.name);
		cafe.signatureMenu = "KH커피";
		cafe.signatureMenuPrice = -500;
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signatureMenuPrice);
		*/
		
		
		// 필드가 보이지 않아서(외부에서 접근이 불가능해서) 오류 발생!
		// 접근제한자를 public에서 private으로 변경했기 때문에 직접 접근이 불가능
		// 직접 접근이 불가능하기 때문에 간접적으로 접근할 수 있는 방법을 만들어주어야 함
		// Cafe라는 클래스에 getter / setter라는 메소드 만들기
		//cafe.signatureMenuPrice = - 500;
		
		// *** 객체의 내부적 관점 / 외부적 관점
		//cafe.windowCleaning();
		//cafe.dishWash();
		//cafe.cleaning();
		//cafe.a();
		//cafe.open();
		// 5000
		// 메소드 호출 부에서는 오로지 값만 넘길 수 있음
		// System.out.println("메인 메서드에서 찍어본 cafe의 주소 : " + cafe);
		cafe.setSignatureMenuPrice(5000);
		cafe.setName("KH카페");
		cafe.setAddress("서울시 중구 남대문로 120 2층");
		// System.out.println(cafe.name);
		
		String cafeName = cafe.getName();
		System.out.println(cafeName);
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		int price = cafe.getSignatureMenuPrice();
		System.out.println(price);
		
		String info = cafe.info();
		System.out.println(info);
	}
	
	
	
	

}
