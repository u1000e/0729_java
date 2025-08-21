package com.kh.chap05.constructor.model.vo;

public class Member {
	
	// [ 필드부 ]
	// 아이디, 비밀번호, 닉네임
	private String userId;
	private String userPwd;
	private String nickName;
	
	// [ 생성자부 ]
	/*
	 * 생성자(Constructor) : 객체를 생성하는데 사용하는 특수한 유형의 메소드
	 * 
	 * [ 표현법 ]
	 * 접근제한자 클래스식별자(매개변수(생략가능)) {
	 * 		해당 생성자를 통해서 객체 생성 시 실행하고자하는 코드;
	 * }
	 * 
	 * 생성자의 역할
	 * -- 기술적인 관점 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가
	 * -- 개념적인 관점 : 객체가 처음부터 유효한 상태를 가지도록 강제
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 => 기본생성자
	 * 2. 매개변수가 존재하는 생성자
	 * => 객체를 생성과 동시에 유효하게 만들기 위해서
	 * 
	 */
	//public Member() {
		// 기본생성자(매개변수 없음)
		// System.out.println("하핫 죽어랏~");
		// 기본생성자는 객체를 생성할 목적으로 호출해서 사용
		// 기본생성자는 생략해도 에러가 발생하지 않음
		// 클래스 내부에 생성자를 하나도 작성하지 않으면 JVM이 기본생성자를 자동으로 만들어줌!
		// 기본생성자를 항상 작성하자!!!! ★★★★★★
	//}
	
	
	// public member() <-- 메소드라고 인식
	
	// public void Member() <-- 메소드라고 인식
	
	public Member() {} // <-- 얘는 무조건 꼭 있어야함!
	
	// 매개변수가 존재하는 생성자
	public Member(String userId) {
		System.out.println("매개변수가 한 개인 생성자");
	}
	
	public Member(String userId, String userPwd) {
		// System.out.println("매개변수가 두 개인 생성자");
		// System.out.println("전달받은 아이디 값 : " + userId);
		// System.out.println("전달받은 비밀번호 값 : " + userPwd);
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	
	/*
	 * 1. 반드시 생성자의 이름을 클래스의 이름과 동일하게 작성해야함(대/소문자 주의)
	 * 2. 반환형이 존재해서는 안됨!(메소드로 판단)
	 * 3. 매개변수 생성자를 명시적으로 작성하면 기본생성자를 만들어주지 않음!
	 * => 우리는 꼭 기본생성자를 억지로 열심히 작성하는 습관을 들여야 함!!!!
	 * 4. 생성자는 동일한 이름으로 여러 개 생성이 가능하지만 매개변수가 중복되어선 안됨!! => 생성자 오버로딩 
	 */
	
	/*
	 * 2025 / 08 / 07 
	 * 오늘의 실습 겸 숙제
	 * 
	 * 기존에 만들어 두었던 다섯 개의 VO클래스 및 실행 클래스를
	 * 오늘 배운 캡슐화 및 생성자를 적용하여 변경하시오.
	 * 
	 * 1) 모든 필드의 접근제한자를 private 으로 변경
	 * 2) 필드에 간접적으로 접근할 수 있도록 getter() / setter() 생성
	 * 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info() 생성
	 * 4) 기본생성자 및 모든 필드를 매개변수로 가지고 있는 생성자 생성
	 * 5) 직접접근으로 사용하고 있던 실행클래스의 코드들을 전부 다 getter / setter 대체
	 * 
	 * 우리반게시판에 동일한 형식으로 제출
	 * 
	 * 제한 시간 : 08 / 08 -- 07:59까지~ 시~~~~~~~~~~~~작
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	// [ 메소드부 ] 
	// 16:00는 여러분들이 힘든 시간이기 때문에, 실습을 드리겠습니다.
	// 모든 필드에 대한 getter() / setter() 만들기 + 모든 필드의 정보를 합쳐서 반환하는 info() 만들기
	// 시 ~ 작
	// getter
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getNickName() {
		return nickName;
	}
	// setter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	// info
	public String info() {
		return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 닉네임 : " + nickName;
	}
	

}
