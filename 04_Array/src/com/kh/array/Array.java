package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// 변수(Variable)
	// 변수란?
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간

	// 변수의 특징
	//
	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다.
	// 4. 지역변수의 경우 메모리의 Stack영역에 올라간다.
	// 5. **하나의 변수공간에는 하나의 값만 대입될 수 있다.**
	// 6. 초기화를 해야만 사용이 가능하다.
	// 7. 초기화는 한 번만 가능하다.
	// 8. 자료형은 크기가 정해져있다.
	// 9. 자료형끼리의 변환이 가능하다.
	// 10. 선언된 Scope안에서만 사용이 가능하다.
	// 11. 변수끼리 연산도 가능하다.

	/*
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음 단, "같은 자료형의 값들"만 담을 수 있음 동종
	 * 모음(homogeneous collection)이라고도 함
	 * 
	 * 자바라는 언어 자체에 내장된 "유일"한 자료구조
	 * 
	 * => 배열의 각 인덱스에 실제 값이 담김 index는 '0'부터 시작한다.
	 */

	public void method1() {

		// 임의의 정수 5개를 선언하고 초기화를 진행해야지!
		/*
		 * int num1 = 12; int num2 = 13; int num3 = 77; int num4 = 7; int num5 = 4; int
		 * sum = num1 + num2 + num3 + num4 + num5; for(int i = 1; i <= 5; i++) { sum +=
		 * numi; } System.out.println(sum);
		 */

		// 배열

		// 1. 배열 선언

		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수식별자;
		 * 
		 * 배열 선언 방법
		 * 
		 * 1) 자료형 배열식별자[]; 2) 자료형[] 배열식별자; --> 요 방법을 사용할
		 * 것!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 */

		// 변수 선언!
		// int num;

		// 배열 선언!
		// int[] nums;

		// int[] nums = 0;

		// 2. 배열 할당

		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] numbers; // 배열 선언 numbers = new int[5]; // 할당
		 * 
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 *
		 * 배열은 참조 자료형이다.
		 */

		// int[] nums = new int[2];

		// nums라는 정수형 배열을 선언하고 5칸 할당받아보기
		int[] nums = new int[5];

		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [ 표현법 ]
		 * 
		 * 배열식별자[인덱스] = 값;
		 */

		nums[0] = 15;
		nums[1] = 33;
		nums[2] = 6;
		nums[3] = 2;
		nums[4] = 66;

		// System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능
	}

	public void methodA() {

		// 배열을 공부해보자

		// 1. 배열선언 및 할당
		int i;
		int[] integers = new int[3]; // 0, 1, 2
		// double[] doubles = new double[2]; // 0, 1

		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length);
		// System.out.println(doubles.length);

		// System.out.println(i); localvariable == 초기화를 진행하지 않으면 사용할 수 없음
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]);
		integers[0] = 1;
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double => 변수 공간에 실제 값을
		 * 바로 담을 수 있음 : (지역)변수
		 * 
		 * 참조자료형 : boolean[], char[], byte[], int[] ... String => 주소값을 담고 있는 변수 : 참조
		 * 변수(레퍼런스)
		 */

		// 인포, A강의장, B강의장, C강의장, 사무실
		/*
		 * String[] KH정보교육원종로지원; KH정보교육원종로지원 = new String[5];
		 * System.out.println("종로점 주소 : " + KH정보교육원종로지원);
		 * 
		 * KH정보교육원종로지원[0] = "인포"; KH정보교육원종로지원[1] = "A강의장"; KH정보교육원종로지원[2] = "B강의장";
		 * KH정보교육원종로지원[3] = "C강의장"; KH정보교육원종로지원[4] = "사무실";
		 * 
		 * // C강의장 출력 //System.out.println(KH정보교육원종로지원[3]);
		 * System.out.println(KH정보교육원종로지원[0]); System.out.println(KH정보교육원종로지원[1]);
		 * System.out.println(KH정보교육원종로지원[2]); System.out.println(KH정보교육원종로지원[3]);
		 * System.out.println(KH정보교육원종로지원[4]);
		 * 
		 * System.out.println("----- 반복문 -----");
		 * 
		 * for(int index = 0; index < 5; index++) {
		 * System.out.println(KH정보교육원종로지원[index]); }
		 */
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);

		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2);

		// 참조자료형에서는 ==(동등비교 연산자) 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열.equals("비교할 문자열");

		// 해시코드 : 주소값을 10진수(int형태)형태로 나타낸 것
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
	}

	public void lotto() {
		// 로또번호생성기 ver_0.2
		int[] lottoNumbers = new int[6]; // 0 , 1 , 2 , 3 , 4 , 5
		/*
		 * lottoNumbers[0] = (int)(Math.random() * 45) + 1; lottoNumbers[1] =
		 * (int)(Math.random() * 45) + 1; lottoNumbers[2] = (int)(Math.random() * 45) +
		 * 1; lottoNumbers[3] = (int)(Math.random() * 45) + 1; lottoNumbers[4] =
		 * (int)(Math.random() * 45) + 1; lottoNumbers[5] = (int)(Math.random() * 45) +
		 * 1;
		 */
		for (int i = 0; i < 6; i++) {
			lottoNumbers[i] = (int) (Math.random() * 45) + 1;
		}
		// Arrays.toString(배열식별자)
		System.out.println(Arrays.toString(lottoNumbers));
	}

	public void methodB() {
		// 5개의 요소를 담을 수 있는 String형 배열을 선언 및 할당하시오.
		// 동물 5총사

		// 1. 배열 선언 및 할당
		String[] animals = new String[5];

		// 2. 배열 인덱스에 동물 대입!
		animals[0] = "고양이";
		animals[1] = "사자";
		animals[2] = "강아지";
		animals[3] = "소";
		animals[4] = "돼지";
		// animals[5] = "토끼"; <-- 문법적으로는 문제가 없음

		// ArrayIndexOutOfBounds
		// 배열의 인덱스가 범위를 벗어남

		// at com.kh.array.Array.methodB(Array.java:225)
		// at com.kh.array.Run.main(Run.java:12)

		// 생각 안해도 괜찮은것
		// 1. ;
		// 2. 어? 조건이다 if
		// 3. 어? 합계다 sum
	}

	public void methodC() {

		// 사용자에게 세 개의 정수를 입력받아서 입력받은 정수 중 최소값 구하기

		// 현 시점에서 배열을 선택할 때의 기준
		// 1. 두 개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 것

		// 1) 사용자로부터 값을 입력받아서 배열의 각 인덱스에 대입
		Scanner sc = new Scanner(System.in); // 입력도구
		int[] nums = new int[3]; // 저장소

		// 배열은 물리적인 구조와 논리적인 구조가 동일합니다.
		/*
		 * System.out.print("첫 번째 정수를 입력해주세요 > "); nums[0] = sc.nextInt();
		 * System.out.println("nums라는 배열의 0번째 인덱스에 대입된 값 : " + nums[0]);
		 * 
		 * System.out.print("두 번째 정수를 입력해주세요 > "); nums[1] = sc.nextInt();
		 * System.out.println("nums라는 배열의 1번째 인덱스에 대입된 값 : " + nums[1]);
		 * 
		 * System.out.print("세 번째 정수를 입력해주세요 > "); nums[2] = sc.nextInt();
		 * System.out.println("nums라는 배열의 2번째 인덱스에 대입된 값 : " + nums[2]);
		 */

		for (int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요 > ");
			nums[i] = sc.nextInt();
			// System.out.println("nums라는 배열의 " + i + "번째 인덱스 값 : " + nums[i]);
		}
		System.out.println(Arrays.toString(nums));

		// 2. 해당 배열의 요소 중 가장 작은값 == 최소값을 출력하는것이 목적

		int min = nums[0];
		/*
		 * if(min > nums[1]) { min = nums[1]; }
		 * 
		 * if(min > nums[2]) { min = nums[2]; }
		 */
		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("배열의 요소 중 가장 작은 값 : " + min);
	}

	public void methodD() {
		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없음!
		 */
		String[] name = new String[3];
		name[0] = "이";
		name[1] = "승";
		name[2] = "철";
		System.out.println(Arrays.toString(name));
		name[2] = "옥";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		name = new String[4];
		name[3] = "굿";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		/*
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 G.C가 알아서 삭제 해준다. : 자동 메모리 관리
		 * 
		 * 기존배열식별자에 할당만 새롭게 한다면 => 기존 참조하고 있던 연결이 끊기고 새로운 배열을 참조함
		 */

		// null : 아무것도 존재하지 않음을 의미하는 값
		/*
		 * 기본값
		 * 
		 * 정수 = 0 실수 = 0.0 문자 = ''
		 * 
		 * 참조자료형 = null
		 * 
		 * 참조자료형에는 null이라는 값이 들어가는데 주소값이 존재하는가 그렇지 않은가
		 */

		name = null; // 현재 연결고리를 끊고싶다.
		System.out.println(name);
		name[0] = "홍길동";
		// 가리키고 있는 대상이 null인데 주소가 없는데 어디 접근함????
	}

	public void methodE() {
		// 그래서 배열 보통 어케씀?
		int[] arr = new int[3]; // 0, 1, 2
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));

		// 배열 보통 선언과 동시에 요소를 대입해서 사용하곤함
		int[] arr1 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr2));
	}

	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사 ☆★☆★
	 * 
	 * 2. 깊은 복사
	 */
	public void methodF() {
		// 얘가 중요함
		int[] origin = { 1, 2, 3, 4, 5 };
		// new int[5];
		// origin[0] = 1; origin[1] = 2; ....
		System.out.println(Arrays.toString(origin));

		// 얕은 복사로 배열을 복사
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));

		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		// 얕은 복사 => 주소값을 대입하는 것 이기 때문에 가리키고 있는 대상이 같다.

		System.out.println(origin.hashCode());
		System.out.println(origin.hashCode());
	}

	// 2. 깊은복사
	public void methodG() {

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[6];
		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4]; for(int i = 0; i < origin.length; i++) {
		 * copy[i] = origin[i]; }
		 */

		// 배열의 깊은 복사의 경우 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음

		// alt + ↑, ↓ (행 이동) (죄송합니다...)
		// ctrl + alt + ↑, ↓ (행 복사) (얘는 당분간 쓰지말기)
		// ctrl + d (행 삭제)
		// ctrl + / (행 주석처리)
		// ctrl + shift + f (코드정리하기)
		System.out.println(Arrays.toString(copy));
		
		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스 / 인터페이스
		 * arraycopy() ==> System클래스
		 *  
		 *  
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스,
		 *   				복사본 배열 식별자, 복사본 배열에서 복사가 시작될 인덱스,
		 *   				복사할 개수);
		 */
		System.out.println(Arrays.toString(origin));
		// Arrays클래스에서 제공하는 copyOf()
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}

}
