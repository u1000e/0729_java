package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void outputToFile() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림
		
		/*
		// 0. 스트림선언
		FileWriter fw = null;
		
		try {
			// 1. 스트림생성
			fw = new FileWriter("b_char.txt");
			
			// 2. 데이터출력 => write()
			fw.write("와..IO..신기하당..");
			fw.write("E");
			
		} catch(IOException e) {
			System.out.println("다시 시도해주세요");
		} finally {
			// 3. 자원반납 => 꼭 지켜야하는 약속 => close()
			try {
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		*/
		/*
		 * try ~ with ~ resource 구문
		 * 
		 * - JDK 7이상부터 사용가능
		 * 
		 * try(스트림객체생성; ...) {
		 *		예외가 발생할 수도있는 구문; 
		 * } catch(예외클래스 e){
		 * 		예외가 발생했을 때 실행할 구문;
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해줌  
		 * 혹여나 할 수도있는 실수를 줄일 수 있는 아주 훌륭한 문법
		 * 대전제 : Closeable를 구현할 것
		 */
		try(FileWriter fw = new FileWriter("c_char.txt"); 
			Scanner sc = new Scanner(System.in)){
			fw.write("와..IO..ㅎㅎ..");
			fw.write("E");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void writeTil() {
		
		// 사용자에게 오늘 학습내용을 입력받아서
		// 외부 파일에 내용을 출력
		
		// 내보낼 파일명은 : 2025년 08월 14일 오늘의 학습일지
		Date now = new Date();
		// System.out.println(now);
		// 2025년 08월 14일
		String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		// System.out.println(titleDate);
		StringBuilder sb = new StringBuilder();
		// String fileName = titleDate + " 오늘의 학습일지.txt";
		sb.append(titleDate);
		sb.append(" 오늘의 학습일지.txt");
		
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fw = new FileWriter(sb.toString());
			System.out.print("내용을 한 번 작성해보시오 > ");
			String content = sc.nextLine();
			fw.write("오늘 학습한 내용 : \t" + content);
		} catch(IOException e) {
			System.out.println("비상 비상 문제발생 비상 비상");
		} finally {
			try {
				if(sc != null) sc.close();
				if(fw != null) fw.close();
			} catch(IOException e) {
				System.out.println("자원 반납을 하다가 문제 발생 비상 비상 비상");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
