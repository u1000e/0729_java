package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.MBTI;

public class Run {

	public static void main(String[] args) {
		
		// HashSet
		// Value값만 저장, index개념 없음 == 순서보장 X, 중복 X
		// [ 표현법 ]
		// HashSet 객체명 = new HashSet(); // 빈 HashSet이 만들어짐
		
		// 문자열만 담을 수 있는 HashSet
		Set<String> set = new HashSet();
		// 요소추가
		// add(추가할요소)
		set.add("안녕하세요");
		set.add("반갑습니다");
		set.add("점심 맛있게 드셨나요?");
		set.add("안녕하세요");
		set.add(new String("반갑습니다"));
		set.add(new String("안녕하세요"));
		set.add("순서 언제 고장남?");
		set.add("왜 계속 넣은대로 나옴?");
		
		System.out.println(set); // 저장 순서 보장 X, 중복 허용 X
		
		// 컴퓨팅 사고 ==> 컴퓨터는 어떻게 동작하는가??????
		// 001110000111101010101111
		
		// 요소 개수 구하기 size()
		System.out.println("set의 요소 개수 : " + set.size());
		
		// MBTI 16개를 다뤄야겠다.
		Set<MBTI> mbti = new HashSet();
		
		MBTI istj = new MBTI("I", "S", "T", "J");
		MBTI isfj = new MBTI("I", "S", "F", "J");
		MBTI estj = new MBTI("E", "S", "T", "J");
		MBTI estp = new MBTI("E", "S", "T", "P");
		
		mbti.add(istj);
		mbti.add(isfj);
		mbti.add(estj);
		mbti.add(estp);
		mbti.add(new MBTI("E", "S", "T", "P"));
		
		/*
		System.out.println("ABC".equals(new String("ABC")));
		System.out.println(new String("ABC").hashCode());
		System.out.println("ABC".hashCode());
		*/
		// HashSet => set에 요소를 추가할 때마다
		// equals()와 hashCode()의 반환값을 기준으로 일치하는 요소가 있는지 비교함
		
		
		System.out.println(mbti); // 저장 순서 보장 X
		
		//istj.equals(isfj);
		
		/*
		 * equals() 호출의 결과가 == true이고 hashCode()의 반환값을 동등비교 연산자를 통해 비교했을 때
		 * 값이 일치하다면 => 동일객체로 판단(중복저장을 하지않음)
		 * 
		 * 필드의 값은 같은데 주소값이 달라서 동일객체가 아닌것으로 판단하기 때문에
		 * VO클래스는 내부에 equals()와 hashCode()를 오버라이딩
		 */
		
		System.out.println("======================================================");
		
		// set의 요소를 반복문을 통해 사용해보자
		/*
		for(int i = 0; i < mbti.size(); i++) {
			System.out.println(mbti.get이 없음;;);
		} 못씀
		*/
		for(MBTI e : mbti) {
			System.out.println(e);
		}
		
		System.out.println("==========================================");
		
		// 2. Set의 요소들을 List에 옮겨담아 인덱스를 활용
		
		//List list = new ArrayList();
		//list.addAll(mbti);
		List list = new ArrayList(mbti);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("====================================");
		
		// 3. Iterator(반복자)
		// StingTokenizer와 비슷한 느낌
		
		Iterator it = mbti.iterator();
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// List도 그렇고 Set도 그렇고 전부 다 iterator 구현중
		//
		// 모든 실제 객체를 Iterator타입으로 사용할 수 있음(다형성 적용)
		
		// => List계열 Set계열은 전부다 iterator()를 호출해서 반복을 시킬 수 있음
		// => Map계열에서는 바로는 불가능

	}

}
