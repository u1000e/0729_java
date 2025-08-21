package com.kh.chap05.run;

import com.kh.chap05.model.vo.Hiphop;
import com.kh.chap05.model.vo.Jazz;
import com.kh.chap05.model.vo.MusicI;

public class Run {
	
	public static void main(String[] args) {
		
		MusicI hiphop = new Hiphop();
		MusicI jazz = new Jazz();
		hiphop.play();
		jazz.play();
		
	}

}
