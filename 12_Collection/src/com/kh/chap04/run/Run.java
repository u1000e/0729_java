package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

public class Run {

	public static void main(String[] args) {
		// Map
		// Key + Value 세트로 저장
		
		// HashMap
		// [ 표현법 ]
		// Map 객체이름 = new HashMap();
		
		// 키   == 식별자 => 생선이름
		// 밸류 == 생선객체
		
		Map<String, Fish> aquarium = new HashMap();
		
		// 비어있는 맵에 요소를 추가해보기!
		// List, Set => add()
		// Collection을 구현한 클래스
		
		// HashMap -> put()
		// => key + value 함께 요소로 추가
		
		// 1. put(K key, V value) : Map에 key + value세트로 요소로 추가해줌
		aquarium.put("농어", new Fish("단맛", "회"));
		aquarium.put("대방어", new Fish("기름맛", "회"));
		aquarium.put("연어", new Fish("담백한맛", "스테이크"));
		aquarium.put("고등어", new Fish("맛있음", "구이"));
		aquarium.put("메기", new Fish("흙맛", "매운탕"));
		
		System.out.println(aquarium); // 저장 순서 보장 X
		aquarium.put("참치", new Fish("기름맛", "회"));
		System.out.println(aquarium); // Value값의 경우 중복 저장 O
		aquarium.put("참치", new Fish("감칠맛", "후토마키"));
		System.out.println(aquarium); // key == 식별자 --> 중복이 발생하면 덮어씌워짐
		
		
		
		// 2. get(Object key) : Object
		// 전달된 key값에 해당하는 value값을 반환해주는 메소드
		// key -> value를 찾아옴
		
		System.out.println(aquarium.get("농어"));
		System.out.println(aquarium.get("메기"));
		System.out.println(aquarium.get("광어"));
		
		// 3. size() : Map에 담겨있는 요소의 개수
		System.out.println(aquarium.size());
		
		// 4. replace(K key, V value) : 키값으로 요소를 찾아서 Value값을 바꿔줌
		aquarium.replace("참치", new Fish("고소한맛", "구이"));
		
		aquarium.replace("없는거", null);
		System.out.println(aquarium);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않는 다는 것이 put과의 차이점
		
		// 5. remove(Object ket) => 해당 키 값을 찾아서 => 키 + 밸류 세트로 지워주는 메소드
		aquarium.remove("참치");
		
		System.out.println(aquarium);
		
		System.out.println("----------------------------------------------------");
		
		// Map에 들어있는 모든 요소들에 순차적으로 접근해야 한다면??
		// for문 X, 향상된 for문 X, while X
		// addAll(Collection c) => X
		// Iterator => X
		
		aquarium.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
		
		// Map이 Key - Value를 가지고 있는데
		// Key값들만 Set으로 바꿀 수 있음
		// Set으로 바꾸면 Iterator를 사용할 수 있기 때문에 반복
		
		// 1) keySet() 호출하기
		
		// 1_1> Map이 가지고 있는 Key들만 Set에 담는다.
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishSet);
		
		// 1_2> Set를 Iterator에 담기
		Iterator<String> itKey = fishSet.iterator();
		
		// 1_3> 반복문 사용하기
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + "-------" + aquarium.get(key));
		}
		
		System.out.println("=======================================");
		
		// 2) entrySet()를 이용하는 방법
		
		// 2_1> Map이 가지고 있는 Key-Value세트를 Set에 담기
		Set<Entry<String, Fish>> entrySet = aquarium.entrySet();
		
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() + "::::::" + e.getValue());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
