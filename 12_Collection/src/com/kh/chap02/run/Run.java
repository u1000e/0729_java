package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import com.kh.chap02.model.vo.Plant;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * 자바의 컬렉션(Collection Framework)
		 * 
		 * 추상적자료형(ADT) ==> Interface
		 * + 
		 * 구현체 => Class
		 * +
		 * 알고리즘 => method
		 * 
		 * =============================================================
		 * 
		 * 배열과 컬렉션의 차이점
		 * 
		 * - 배열의 아주 쬐끔 불편한 점
		 * 
		 * 1. 배열을 사용하려고 할 때 꼭 크기를 할당을 해야함 => 한 번 지정된 크기는 변경이 불가능
		 * 2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어주거나 땡기는 코드를 써야함
		 * 
		 * - 컬렉션
		 * 1. 크기의 제약이 없음
		 * => 처음 컬렉션을 사용할 때 크기를 지정하지 않더라도 사용할 수 있음
		 * => 만약 요소가 추가되면서 크기를 넘어서는 상황이 발생하면 알아서 확장됨
		 * 2. 중간에 값을 추가하거나 삭제하는 경우 기존값을 밀어주거나 땡겨주는 로직이 이미 구현되어 있음
		 * => 그때그때 필요한 메소드들을 호출해서 사용하면 됨
		 * 
		 * -- 중립
		 * - 배열의 경우 하나의 타입의 자료형만 사용할 수 있음
		 * - 컬렉션의 경우 여러 타입의 데이터들을 관리할 수 있음 : 같은 타입의 데이터만 묶어서도 사용가능
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져있고, 조회의 목적 => 배열
		 * 데이터들의 추가, 수정, 삭제가 많이 일어난다 => 컬렉션
		 * 
		 * 개념적인 컬렉션의 종류
		 * 
		 * - List 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지(Index), 중복값 허용
		 * 					=> LinkedList, ArrayList, Vector
		 * 					-> ArrayList
		 * 
		 * - Set 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지 X, 중복값 허용 X
		 * 					=> HashSet, TreeSet...
		 * 					-> HashSet
		 * 
		 * - Map 계열 : 키(Key) - 값(Value)세트로 저장 / 저장 시 순서 유지 X, 키 중복X/ 값 중복 O
		 * 					=> HashMap, TreeMap, MultiValueMap...
		 * 					-> HashMap, Properties
		 */
		
		// ArrayList
		// ArrayList 생성 방법
		// ArrayList 식별자 = new ArrayList();
		// 1. 기본생성자 호출로 만들기 => 기본 크기 10칸
		// ArrayList 식별자 = new ArrayList(정수);
		// 2. 인자로 전달한 정수값만큼의 크기를 가진 리스트를 만들겠다.
		
		ArrayList plants = new ArrayList(3); 
		// 내부적으로 크기가 3칸짜리인 List를 만들겠다.
		// 배열타입[] arr = new 배열타입[3];
		
		System.out.println(plants);
		
		/*
		arr[0] = new Plant();
		arr[1] = new Plant();
		*/
		// 1. 비어있는 List에 요소를 추가 
		// add(E e) : 해당 리스트 마지막에 인자로 전달된 요소를 추가해주는 메소드
		// E -> element : 제네릭
		/*
		Plant[] p = new Plant[3];
		p[0] = new Plant("서양란", "호접란");
		p[1] = new Plant("동양란", "황룡관");
		p[2] = new Plant("관엽", "금전수");
		System.out.println(Arrays.toString(p));
		*/
		plants.add(new Plant("서양란", "호접란"));
		plants.add(new Plant("동양란", "황룡관"));
		plants.add(new Plant("관엽", "금전수"));
		plants.add("식물 끝!");
		
		// 기존 Object[]의 크기를 넘어서는 요소가 추가될 경우
		// Arrays.copyOf메소드를 이용하여 깊은 복사로 더 큰 배열로 할당함
		// Object타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트에 담을 수 있음
		System.out.println(plants.toString());
		
		// add메소드 호출 시 오버로딩된 형태의 메소드를 사용
		// add(int index, E e) : List의 index에 전달한 요소를 추가
		plants.add(0, "식물 시작~");
		plants.add(3, new Plant("관엽", "홍콩야자"));
		
		System.out.println(plants);
		// 중간위치에 요소를 추가했을 때 기존의 요소들을 한 칸씩 밀어주는 작업이 내부적으로 구현되어있음
		
		// 2. 요소를 수정하는 메소드
		// set(int index, E e) : List의 index위치에 값을 전달된 요소(e)로 set해주는 메소드
		plants.set(0, "시~~작~");
		
		System.out.println(plants);
		
		// 3. 요소 삭제
		// remove(int index) : List의 index위치에 담긴 요소를 삭제하는 메소드
		plants.remove(0);
		
		// plants.remove(5);
		// IndexOutOfBoundsException == index값을 잘 고려해서 인자값을 전달해야함
		
		// "식물 끝!"
		String str = (String)plants.remove(4);
		System.out.println(str);
		System.out.println(plants);
		
		Plant goldDragonCrown = (Plant)plants.remove(1);
		
		System.out.println(goldDragonCrown.getType() + "류의 " + 
						   goldDragonCrown.getName() + "이 삭제되었습니다.");
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		// 4. 리스트의 크기를 반환받기
		// size() : 리스트에 담겨있는 요소의 개수
		System.out.println(plants.size());
		System.out.println("마지막 인덱스 : " + (plants.size() - 1));
		
		// 5. List의 해당 index 위치에 담긴 요소를 반환받는 메소드
		// get(int index) : E
		System.out.println(plants);
		Plant plant = (Plant)plants.get(0);
		System.out.println(plant);
		
		// 1번 인덱스에 위치한 식물의 이름을 변수로 대입해서 활용하고 싶음
		String hongkongTree = ((Plant)plants.get(1)).getName();
		System.out.println(hongkongTree);
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("식물 종류 : " + ((Plant)plants.get(i)).getType());
		}
		
		// 향상된 for문 => 값을 조회하는 목적으로 사용가능
		// for(값을 받아줄 변수 : 순차적으로 요소에 접근할 배열 또는 컬렉션) {  }
		for(Object p : plants) {
			System.out.println(p.toString()); // 동적바인딩
		}
		
		// 6. 리스트 자르기
		// subList(int index1, int index2) : List
		// index1부터 index2까지의 요소를 추출해서 새로운 리스트를 반환
		List sub = plants.subList(0, 1);
		System.out.println(sub);
		
		// 7. 리스트에 요소를 왕창 추가하기
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값(Value)이 중복될 수 있음
		
		// 8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
		// isEmpty() : 리스트에 요소가 존재하지 않다면 true / 요소가 하나라도 있다면 false
		System.out.println(plants.isEmpty());
		
		plants.clear();
		
		System.out.println(plants.isEmpty());
		
	}
	
	
	
	
	
	
	
	
	

}
