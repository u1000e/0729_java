package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	/*
	 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 
	 * 논리값 논리연산자 논리값  => 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 좌항과 우항의 값 중 하나라도 true일 경우 최종 결과값이 true
	 */
	// AND
	public void method1() {
		
		// 계획
		// 
		// 1. 사용자에게 정수값을 하나 입력받은 후
		// 2. 사용자가 입력한 정수 값이 0보다 크면서 짝수인지 판별
		// 3. 그리고 나서 결과를 출력
		
		// 0.
		Scanner sc = new Scanner(System.in);
		
		// 1. 
		System.out.print("정수 값을 입력해주세요 > ");
		int num = sc.nextInt();
		// System.out.println(num); // 모범시민이 해야할 일 변수 찍어보기
		
		// 2.
		// 무슨 값? == num
		// 무슨 연산???
		// 1. 0보다 큰가?(대소비교)					  //    num  >  0
		// 2. 2로 나눈 나머지가 0과 일치하는가?(동등비교) // (num % 2) == 0
		
		// AND 연산자
		// &&의 의미 : 그리고, ~~이면서, ~~이고
		
		boolean result = (num > 0) && (num % 2 == 0);
		// 사용자가 입력한 정수가 0보다 크다 그리고 사용자가 입력한 정수를 2로 나눴을 때 나머지가 0인가요?
		
		System.out.println("입력값이 0보다 크면서 짝수 입니까 ? : " + result);
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 정수 값을 입력받아서
		System.out.print("1부터 100사이의 숫자를 입력해주세요 > ");
		// 변수에 대입한 뒤
		int number = sc.nextInt();
		// 출력해보세요.
		// System.out.println("입력받은 값 : " + number);
		
		// 사용자가 입력한 정수가 1 ~ 100 사이의 값인지 확인하기
		// 1_1. 사용자가 입력한 정수 == number
		// 1_2. 1
		// 1_3. 100
		
		// 1 <= 사용자가 입력한 값 <= 100
		// 1 <= number <= 100
		//System.out.println(1 <= number <= 100);
		
		// 2_1. (0 < number) && (number < 101)
		// 2_2. (100 >= number) && (1 <= number)
		// 2_3. (1 <= number) && (number <= 100)
		// 2_4. (number >= 1) && (100 >= number)
		
		// 사용자가 입력한 값이 1 ~ 100 사이의 값인지를 판별하여 출력해줄 것
		boolean result = (1 <= number) && (number <= 100);
		System.out.println("입력값이 1부터 100사이의 값입니까? : " + result);
	}
	
	// OR
	public void method3() {
		
		// 사용자에게 한 글자를 입력 받아서
		// 입력받은 값이 'A' 또는 'a'인지 확인해서 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 글자만 입력해주세요 > ");
		char letter = sc.nextLine().charAt(0);
		// System.out.println(letter);
		/*
		String str = "KH정보교육원";
		char ch = str.charAt(5);
		System.out.println(ch);
		index : 0부터 시작
		*/
		// 무슨 값?
		// 1_1. 사용자가 입력한 한 글자 == letter
		// 1_2. 'A'
		// 1_3. 'a'
		
		// 무슨 연산?
		// == 동등비교 연산
		// 단일 문자의 경우 동등비교 연산이 가능한가?
		// 가능하다! ==> 왜???
		// char형이 int형으로 자동형변환이 일어난 뒤 연산을 함
		
		boolean result = (letter == 'a') || (letter == 'A');
		// || : ~~~~이거나, 또는
		
		System.out.println("사용자가 입력한 값이 'A'또는 'a'인가요? > " + result);
	}
	/*
	 * AND(&&) : 두 개의 조건이 모두 true일 경우 true
	 * 
	 * true && true   : true
	 * true && false  : false
	 * false && true  : false
	 * false && false : false
	 * 
	 * OR(||) : 두 개의 조건 중 하나라도 true일 경우 true
	 * 
	 * true || true   : true
	 * true || false  : true
	 * false || true  : true
	 * false || false : false
	 */
	
	public void tip() {
		int num = 10;
		boolean result = false && (num > 0);
		boolean result2 = (num < 0) && (num == 10);
	}
	
	
	
	
	
	
	

}
