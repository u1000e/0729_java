package com.kh.chap05.model.vo;

public class Jazz extends Music implements MusicI {

	@Override
	public void play() {
		System.out.println("재즈를 재생합니다.");
	}
	
}
