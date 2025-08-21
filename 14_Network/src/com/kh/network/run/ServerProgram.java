package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		/*
		 * 통신을 하기 위해서는 데이터 전송 이전에 서버와 클라이언트의 연결이 필요함
		 * 
		 * ServerSocket
		 * - 포트번호와 연결(Bind)해서 외부의 연결요청을 기다리다가 연결요청이 들어오면 수락해줄 용도
		 * - 수락하는 순간 서버의 Socket객체 생성
		 * 
		 * Socket
		 * - Process간의 통신을 담당
		 * - Socket객체를 이용해서 통신을 위한 기반스트림 InputStream / OutputStream을 제공받음
		 * - 기반스트림만으로는 제약이 있으니 보조스트림을 사용할 것!
		 * 
		 * -- 소켓통신용 서버측 프로그램 작성 절차
		 * 
		 * 1) 포트 번호 지정(서버측에서 몇 번 포트를 열어둘 것인지)
		 * 2) ServerSocket객체 생성 => 생성자 인자값으로 포트번호 전달(포트결합/Biding)
		 * 3) 대기상태
		 * 4) 클라이언트가 연결요청을 하면 수락 후 통신가능한 Socket객체를 반환받음
		 * 5) Socket객체를 이용해서 입/출력용 스트림을 열어주기
		 * 6) 보조스트림을 추가하여 성능 개선
		 * 7) 데이터 주고받기
		 * 8) 자원반납
		 */
		
		// 서버측 프로그램
		
		// 0) 필요한 변수 세팅
		Scanner sc = new Scanner(System.in);
		
		// 자원반납을 위해 미리 참조변수 선언 및 null값으로 초기화
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) 포트번호 지정 
		int portNumber = 1024;
		
		try {
			// 2) ServerSocket객체 생성 및 포트결합(bind)
			server = new ServerSocket(portNumber);
			
			// 항상 대기상태 클라이언트가 연결요청을 할 때까지 하염없이 기다림
			// 3) 대기상태
			System.out.println("나는 하염없이 기다린다........");
			
			// 4) 연결요청이 오면 수락 후 해당 클라이언트와 통신할 수 있는 서버 측 Socket객체 생성
			// ServerSocket클래스의 메소드로 accept() : Socket객체 반환
			Socket socket = server.accept();
			
			System.out.println("클라이언트와의 연결 성공!");
			// socket객체를 이용해서 Client의 정보를 반환받을 수 있음
			System.out.println(socket.getInetAddress().getHostName());
			
			// 5) 클라이언트와 통신할 수 있는 입/출력용 스트림 생성
			// 6) 보조스트림을 추가해서 성능 개선
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// socket에서 제공하는 입력용 기반스트림 => InputStream => 1Byte
			// 바이트스트림과 문자스트림을 호환해줄 수 있는 보조스트림 => InputStreamReader
			// 속도향상, 한글전달도 위한 입력용 보조스트림 => BufferedReader => 2Byte
			
			// 출력용 스트림(서버가 클라이언트에게 데이터를 전송하기 위한 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter는 2Byte짜리 문자용이지만 1Byte짜리도 시원하게 사용이 가능
			
			// 7) 데이터 주고받기
			// Client와 데이터를 주거니 받거니 하도록 구성
			while(true) {
				// 7_1) 입력받기
				String message = br.readLine();
				if(message.equals("null")) {
					break;
				}
				System.out.println("클라이언트로 부터 받은 메시지 : " + message);
				// 7_2) 출력하기
				System.out.print("클라이언트에게 보낼 메시지 > ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				// 스트림에 있는 데이터를 강제로 내보내는 메소드
				pw.flush();
			}
			
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			// 8) 자원 반납 => 생성의 역순으로
			try {
				if(pw != null) {
					pw.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(sc != null) {
					sc.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(server != null) {
					server.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
