package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자 : 단항연산자로 한 번에 1씩 증가(더하거나) / 감소(빼거나)하는 연산을 함
	 * 
	 * [ 표현법 ]
	 * ++ : 값을 1증가 시키는 연산자
	 * -- : 값을 1감소 시키는 연산자
	 * 
	 * => 증감을 먼저 할건지, 나중에 할건지에 따라 연산자의 위치가 달라짐
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값				--> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리
	 * 후위 연산 : 값++, 값--				--> 먼저 값을 처리하고 나서 증가하거나 감소
	 */
	
	// 후위연산 첫 번째 메소드
	public void method1() {
		//System.out.println("중간 점검");
		int num = 10;
		System.out.println("num : " + num); // "num : 10"
		num++;
		System.out.println("num : " + num);   // "num : 11"
		num--;
		
		System.out.println("num : " + num);   // "num : 10"
		System.out.println("num : " + num++); // "num : 10"
		System.out.println("num : " + num++); // "num : 11"
		System.out.println(num); // 12
	}
	
	// 두 번째 메소드
	public void method2() {
		int a = 10;
		int b = a++;
		// 1번 35행
		// 1. a라는 식별자를 가진 int형 변수공간을 할당받고
		// 2. 정수형 리터럴 값 10을
		// 3. 대입해버림
		
		// 2번 36행의 좌항 :
		// b라는 식별자를 가진 int형 변수공간을 할당받음
		
		// 3번 36행의 우항_1 :
		// a라는 변수 공간에 대입된 정수형 리터럴값을 가져옴
		
		// 4번 36행의 우항_2 :
		// a라는 공간의 값을 1증가
		
		// 5번 36행의 가운데 :
		// 가져온 리터럴값을 b공간에 초기화
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // c : 19
		System.out.println("d : " + d); // d : 20
		
		
		int num = 20;
		int result = num++ * 3;
		
		System.out.println(num);    // 21
		System.out.println(result); // 60
	}
	
	
	// 전위연산
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); 
		System.out.println("b : " + b);
		
		int num = 20;
		int result = ++num * 3;
		
		System.out.println(num);
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	


