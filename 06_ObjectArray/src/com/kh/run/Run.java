package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		
		//Restaurant r1 = new Restaurant();
		//System.out.println(r1.information());
		
		// 1절
		// 사용자에게 식당의 정보를 입력받아서
		// 입력받은 식당의 정보를 출력해주는 프로그램
		// 3개의 식당정보를 입력받겠다고 가정
		Scanner sc = new Scanner(System.in);
		
		Restaurant r0 = null;
		Restaurant r1 = null;
		Restaurant r2 = null;
		
		for(int i = 0; i < 3; i++) {
			System.out.print("식당의 상호를 입력해주세요 > ");
			String storeName = sc.nextLine();
			
			System.out.print("식당의 주소를 입력해주세요 > ");
			String address = sc.nextLine();
			
			System.out.print("식당의 주력메뉴를 입력해주세요 > ");
			String mainMenu = sc.nextLine();
			
			if(i == 0) {
				r0 = new Restaurant(storeName, address, mainMenu);
			} else if(i == 1) {
				r1 = new Restaurant(storeName, address, mainMenu);
			} else {
				r2 = new Restaurant(storeName, address, mainMenu);
			}
		}
		System.out.println(r0.information());
		System.out.println(r1.information());
		System.out.println(r2.information());
		
		// 1번 setter 호출
		// 2번 생성자 매개변수로 인자값을 전달
		/*
		System.out.print("식당의 상호를 입력해주세요 > ");
		String storeName2 = sc.nextLine();
		
		System.out.print("식당의 주소를 입력해주세요 > ");
		String address2 = sc.nextLine();
		
		System.out.print("식당의 주력메뉴를 입력해주세요 > ");
		String mainMenu2 = sc.nextLine();
		
		Restaurant r2 = new Restaurant(storeName2, address2, mainMenu2);
		
		System.out.print("식당의 상호를 입력해주세요 > ");
		String storeName3 = sc.nextLine();
		
		System.out.print("식당의 주소를 입력해주세요 > ");
		String address3 = sc.nextLine();
		
		System.out.print("식당의 주력메뉴를 입력해주세요 > ");
		String mainMenu3 = sc.nextLine();
		
		Restaurant r3 = new Restaurant(storeName3, address3, mainMenu3);
		
		System.out.println(r.information());
		System.out.println(r2.information());
		System.out.println(r3.information());
		*/
		// 2절
		// 사용자에게 상호명을 입력받아서
		// 만약에 입력받은 상호와 일치하는 식당이 존재하다면 메인메뉴를 출력해주는 프로그램
		System.out.print("가게명을 입력해주세요 > ");
		String searched = sc.nextLine();
		
		if(searched.equals(r0.getStoreName())) {
			System.out.println("대표 메뉴 : " + r0.getMainMenu());
		} 
		
		if(searched.equals(r1.getStoreName())) {
			System.out.println("대표 메뉴 : " + r1.getMainMenu());
		}
		
		if(searched.equals(r2.getStoreName())) {
			System.out.println("대표 메뉴 : " + r2.getMainMenu());
		}
		/*
		for(int i = 0; i < 3; i++) {
			if(searched.equals(ri..??))
		}
		*/
		/*
		switch(searched){
			case "뼈구이" 
		}
		*/
		
		
		
		
		
		
		

	}

}
