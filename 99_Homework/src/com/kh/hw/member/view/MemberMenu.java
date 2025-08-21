package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMemu() {
		while(true) {
			int count = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + count + "명입니다.");
	
			if(count != 10) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : findAll(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("없는 메뉴를 선택하셨습니다. 다시 입력하세요~");
			}
		}
	}
	
	private void findAll() {
		
		System.out.println();
		System.out.println("회원 전체 조회 서비스 입니다.");
		
		Member[] members = mc.getM();
		int count = mc.existMemberNum();
		System.out.println("총 " + count + "명의 회원이 존재합니다.");
		
		if(count > 0) {
			for(int i = 0; i < members.length; i++) {
				if(members[i] != null) {
					System.out.println("=============================");
					System.out.println("아이디 : " + members[i].getId());
					System.out.println("비밀번호 : " + members[i].getPassword());
					System.out.println("이름 : " + members[i].getName());
					System.out.println("이메일 : " + members[i].getEmail());
					System.out.println("============================");
					System.out.println();
				}
			}
		} else {
			System.out.println("회원이 존재하지 않습니다.");
		}
		
		System.out.println();
	}
	
	
	
	private void insertMember() {
		
		// 아이디 => 중복이 발생하면 안되므로 mc의 메소드를 호출해서 중복확인
		//          중복이 아닐시만 pass
		String id = "";
		while(true) {
			System.out.print("아이디를 입력해주세요 > ");
			id = sc.nextLine();
			
			// 중복아이디가 있다 == true
			// 중복아이디가 없다 == false
			boolean result = mc.checkId(id);
			if(result) {
				System.out.println("중복아이디가 존재합니다. 다시 입력하세요");
			} else {
				break;
			}
		}
		// 이름
		System.out.print("이름을 입력해주세요 > ");
		String name = sc.nextLine();
		// 비밀번호
		System.out.print("비밀번호를 입력해주세요 > ");
		String password = sc.nextLine();
		// 성별 => M, m, F, f가 아니면 다시 입력받아서
		char gender = ' ';
		while(true) {
			
			System.out.print("성별을 입력해주세요(M/F) > ");
			gender = sc.nextLine().charAt(0);
			
			if(gender == 'm' || gender == 'M' ||
			   gender == 'f' || gender == 'F') {
				break;
			} else {
				System.out.println("성별을 다시 입력해주세요!");
			}
		}
		
		// 이메일
		System.out.print("이메일을 입력해주세요 > ");
		String email = sc.nextLine();
		
		// 나이
		System.out.print("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
		
	}
	
	private void searchMember() {
		
		while(true) {
			System.out.println("회원 검색 서비스입니다.");
			System.out.println();
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println();
			System.out.print("메뉴를 선택해 주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : searchId(); break;
			case 2 : searchName(); break;
			case 3 : searchEmail(); break;
			case 9 : return;
			default : System.out.println("이상한거 쓰지마세요~~");
			}
		}
	}
	
	private void searchId() {
		
		System.out.print("아이디를 입력해주세요 > ");
		String id = sc.nextLine();
		
		Member member = mc.searchId(id);
		// 아이디가 존재했을 경우 => heap영역에 생긴 Member타입의 객체 주소값
		// 아이디가 존재하지 않았을 경우 => null
		//System.out.println(member);
		
		if(member != null) {
			System.out.println("아이디 : " + id + "의 검색결과입니다.");
			System.out.println("이름 : " + member.getName());
			System.out.println("나이 : " + member.getAge());
			System.out.println("이메일 : " + member.getEmail());
		} else {
			System.out.println("입력하신 아이디는 존재하지 않습니다.");
		}
	}
	
	private void searchName() {
		
		System.out.println("이름으로 검색하기 서비스 입니다.");
		System.out.print("검색하실 이름을 입력해주세요 > ");
		String keyword = sc.nextLine();
		
		Member[] members = mc.searchName(keyword);
		
		if(members[0] != null) {
			for(int i = 0; i < members.length; i++) {
				System.out.println("=====================");
				System.out.println("아이디 : " + members[i].getId());
				System.out.println("이름 : " + members[i].getName());
				System.out.println("이메일 : " + members[i].getEmail());
				System.out.println("=====================");
			}
			
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}
	}
	
	private void searchEmail() {
		
	}
	
	private void updateMember() {
		while(true) {
			
			System.out.println();
			System.out.println("회원 정보 수정 서비스 입니다.");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("4. 성별 수정하기");
			System.out.println("5. 나이 수정하기");
			System.out.println("9. 메인메뉴로 돌아가기");
			System.out.println();
			System.out.print("메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
			case 1 : updatePassword(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 9 : return;
			default : System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	private void updatePassword() {
		// 아이디랑 기존 비밀번호랑 바꿀비밀번호랑
		// 3개의 값을 입력받아서
		// 아이디와 비밀번호가 일치하다면 기존 비밀번호를 바꿀 비밀번호로 변경
		// 아이디 또는 기존 비밀번호 둘 중 하나라도 일치하지 않다면 안 바꿔줌
		
		System.out.print("아이디를 입력하세요 > ");
		String userId = sc.nextLine();
		
		System.out.print("기존 비밀번호를 입력하세요 > ");
		String userPw = sc.nextLine();
		
		System.out.print("새 비밀번호를 입력하세요 > ");
		String newPassword = sc.nextLine();
		
		boolean result = mc.updatePassword(userId, userPw, newPassword);
		
		if(result) {
			System.out.println("비밀번호 변경에 성공했습니다 추카포카링");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다.");
			System.out.println("입력값을 다시 확인해주세요.");
		}
		
	}
	
	private void deleteMember() {
		
		System.out.println("회원 삭제 서비스입니다.");
		
		System.out.print("삭제하실 회원의 아이디를 입력해주세요 > ");
		String userId = sc.nextLine();
		
		System.out.print("삭제하실 회원의 비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		
		int result = mc.deleteMember(userId, userPwd);
		
		if(result > 0) {
			System.out.println("삭제 성공 ~");
		} else {
			System.out.println("그런 회원은 없어요 ~");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
