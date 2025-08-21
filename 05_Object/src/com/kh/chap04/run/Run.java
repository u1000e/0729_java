package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
		
		System.out.println(StaticController.str);

		FieldController fc = new FieldController();
		// 1. FieldController 자료형으로 fc라는 이름의 지역변수를 선언
		// 2. 객체 생성 (new키워드를 만났을 때) global 멤버변수 할당
		// 3. 주소값을 대입
		
		System.out.println(fc.global);
		
		fc.checkVariable(50);
		// checkVariable호출 == parameter(매개변수) 할당 및 초기화
		
		//checkVariable 호출 종료 시
		// parameter, local 지역변수 소멸
		
		System.out.println(fc.global);
		fc = null; // global 사용 불가능
		
		//System.out.println(fc.global);
		
		
		// 목표 : str출력하기
		/*
		StaticController sc = new StaticController();
		System.out.println(sc.str);
		*/
		System.out.println(StaticController.str);
		System.out.println(StaticController.JAVA_VERSION);
		
		//System.out.println(Arrays.toString(new int[2]));
		//System.out.println(Math.random()); // 0.0 ~ 0.99999~
		System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.nextLine();
		
		/*
		 * AccessModifier(접근제어자 / 접근제한자)
		 * 
		 * (+)public => 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부) 접근 가능
		 * 
		 * (#)protected => 같은 패키지라면 무조건 접근 가능!
		 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근 가능
		 * 			 => 상속이라는 개념은 05_Object / 06_ObjectArray 끝나고 07번에서 배울 것
		 * 
		 * (~)default(package friendly) => 오로지 같은 패키지에서만 접근 가능
		 * 
		 * (-)private => 오직 클래스 내부에서만 접근 가능
		 */
	}

}
