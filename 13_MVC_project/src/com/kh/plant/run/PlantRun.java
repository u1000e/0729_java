package com.kh.plant.run;

import com.kh.plant.view.PlantView;

public class PlantRun {

	public static void main(String[] args) {
		
		// MVC 패턴(Model - View - Controller)
		// 애플리케이션의 구조를 세가지 요소로 분리하자
		// 라는 소프트웨어 아키텍쳐 디자인 패턴
		// 1. Model
		// 데이터 담당 => VO
		// 외부매체와의 상호작용 => DAO
		// 아직은 없음 =========> 비즈니스 로직
		// 2. View
		// 사용자 인터페이스를 담당
		// 사용자에게 정보 표시 / 사용자의 입력값을 받아줌
		// 모델에서 만들어진 데이터를 시각적으로 표현
		// 모델과 직접 상호작용하지 않음
		// 3. Controller
		// Model하고 View의 중간다리 역할
		// 사용자 입력을 처리하고 모델에 전달
		// 모델에서 일어난 처리작업을 뷰에 반영
		
		PlantView pv = new PlantView();
		pv.mainMenu();

	}
	
	
	
	
	
	
	

}
