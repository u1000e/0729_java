package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		FootBall fb = new FootBall();
		fb.rule();
		BaseBall bb = new BaseBall();
		bb.rule();
		
		/*
		Sports s = new Sports();
		s.rule();
		추상클래스로 선언되었기 때문에 객체 생성이 불가능함
		*/
		
		// 다형성은 적용가능
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}
		
		

	}

}
