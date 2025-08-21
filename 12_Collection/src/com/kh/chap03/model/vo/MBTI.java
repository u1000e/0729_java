package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {
	
	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFeeling;
	private String judgingPerceiving;
	
	public MBTI() {
		super();
	}
	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFeeling,
			String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFeeling = thinkingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}
	
	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}
	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}
	public String getSensingiNtuition() {
		return sensingiNtuition;
	}
	public void setSensingiNtuition(String sensingiNtuition) {
		this.sensingiNtuition = sensingiNtuition;
	}
	public String getThinkingFeeling() {
		return thinkingFeeling;
	}
	public void setThinkingFeeling(String thinkingFeeling) {
		this.thinkingFeeling = thinkingFeeling;
	}
	public String getJudgingPerceiving() {
		return judgingPerceiving;
	}
	public void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}
	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition
				+ ", thinkingFeeling=" + thinkingFeeling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgingPerceiving, sensingiNtuition, thinkingFeeling);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensingiNtuition, other.sensingiNtuition)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	
	// 결론적으로 우리가 해야할 일
	// 필드의 값이 동일하다면 
	// equals() 와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		MBTI mbti = (MBTI)obj;
		// 필드값 비교
		// ei, sn, tf, jp 넷 중 하나라도 다르면 false을 반환
		// 내필드랑    매개변수로 받아온애 필드
		if(!this.introversionExtroversion.equals(mbti.introversionExtroversion) ||
		   !this.sensingiNtuition.equals(mbti.sensingiNtuition) ||
		   !this.thinkingFeeling.equals(mbti.thinkingFeeling) ||
		   !this.judgingPerceiving.equals(mbti.judgingPerceiving)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		// 객체를 가지고 뭐 알아서 10진수로 만들어서 반환
		// 필드값 똑같으면 똑같은 해시코드 나오게하고싶다
		
		// String isfj = "I" + "S" + "F" + "J";
		// isfj.toString().hashCode();
		// "isfj".toString().hashCode();
		
		return (introversionExtroversion + sensingiNtuition 
				+ thinkingFeeling + judgingPerceiving).hashCode();
	}
	
	*/
	
	
	
	
	
}
