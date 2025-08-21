package com.kh.chap07.remote.model.vo;

// 필요한 값들을 저장하는 역할
public class Television {
	
	private boolean on;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "대한민국 24 뉴스채널";
		channel[1] = "시니어토크쇼";
		channel[2] = "스튜디오K";
		channel[3] = "EBS 평생학교 2교시";
		channel[4] = "꾸러기TV";
	}
	
	public String[] getChannel() {
		return channel;
	}
	
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	

}
