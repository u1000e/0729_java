package com.kh.second;

public class Run {
	
	public static void main(String[] args) {
		// printMyName();
		// �ܺ� Ŭ������ �����ϴ� �޼ҵ���� ȣ���ϰ� ���� ����?
		
		/*
		 * ȣ���� �޼ҵ尡 �����ϴ� Ŭ������ ����(new) �������
		 * 
		 * [ ǥ���� ]
		 * "Ŭ�����̸�" "Ŭ�������� ����� ��Ī" = new "Ŭ�����̸�()";
		 * 
		 * �� �� ������ ���� �� ȭ/���� ���� ���ظ� �� ����
		 * 
		 */
		PrintController pc = new PrintController();
		
		//printMyName();
		pc.printMyName();
		// .
		// ���������� / �������ٿ�����
		
		Hahahoho haho = new Hahahoho();
		
		haho.printMyName();
	}

}
