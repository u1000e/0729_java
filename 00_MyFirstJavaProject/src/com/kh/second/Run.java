package com.kh.second;

public class Run {
	
	public static void main(String[] args) {
		// printMyName();
		// 외부 클래스에 존재하는 메소드들을 호출하고 싶을 때는?
		
		/*
		 * 호출할 메소드가 존재하는 클래스를 생성(new) 해줘야함
		 * 
		 * [ 표현법 ]
		 * "클래스이름" "클래스명을 대신할 별칭" = new "클래스이름()";
		 * 
		 * ↑ 이 내용은 다음 주 화/수에 걸쳐 이해를 할 예정
		 * 
		 */
		PrintController pc = new PrintController();
		
		//printMyName();
		pc.printMyName();
		// .
		// 참조연산자 / 직접접근연산자
		
		Hahahoho haho = new Hahahoho();
		
		haho.printMyName();
	}

}
