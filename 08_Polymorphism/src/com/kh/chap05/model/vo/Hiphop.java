package com.kh.chap05.model.vo;

public class Hiphop extends Music implements MusicI, MultipleInterface {
	
	@Override
	public void play() {
		System.out.println("힙합을 재생합니다.");
	}
	

}
