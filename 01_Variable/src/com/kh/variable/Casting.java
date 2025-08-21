package com.kh.variable;

public class Casting {
	/*
	 * Type Casting(�ڷ�����ȯ) : �ڷ����� �ٲٴ� ����
	 * 
	 * �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١� �ſ� �߿� �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
	 * 
	 * ���� �е��� ���� ���������� ������� ū�ϳ���!!!
	 * �ڹٿ��� ���� ó���ϴ� ��Ģ
	 * 
	 * 1. =(���� ������)�� �������� ���� / �������� ���� �ڷ����̾�� �Ѵ�.
	 * => ���� �ڷ����� �ش��ϴ� ���ͷ����� ������ �� ����
	 * => �ڷ����� �ٸ� ���? == ���� �ٲ㼭 �����ؾ� ��.
	 * 
	 * 2. ���� �ڷ����鳢���� ������ ������
	 * => �ڷ����� �ٸ��� ������ �ϰ�ʹ�?? �� �߿� �ϳ��� "����ȯ"�ؼ� ������ �ϳ��� �����ϰ� ����
	 * 
	 * 3. ������ ������� ������ �ڷ����̾�� �Ѵ�.
	 * => 1 + 1 = 2(����), 1.1 + 1.1 = 2.2(�Ǽ�)
	 * 
	 * [ ǥ���� ] (�ٲٰ�����ڷ���)��
	 * ����ȯ������ / cast������
	 * 
	 * ����ȯ�� ����
	 * 
	 * 1. �ڵ�����ȯ(Promotion) : �ڵ����� ����ȯ�� �����
	 * 
	 * 		���� ũ���� �ڷ��� -> ū ũ���� �ڷ���
	 * 		���� ����ȯ�� �� �ʿ䰡 ����
	 * 
	 * 2. ��������ȯ(Type Casting) : �ڵ�����ȯ�� �̷������ �ʴ� ��� ����
	 * 
	 * 		���� ����ȯ�� �ؾ��� �� => () �� ���ؼ� ����
	 * 
	 */
	/*
	 * boolean : 1Byte
	 * char    : 2Byte
	 * byte    : 1Byte
	 * short   : 2Byte
	 * int     : 4Byte
	 * long    : 8Byte
	 * float   : 4Byte
	 * double  : 8Byte
	 */
	
	
	// �ڵ�����ȯ(Promotion) : ���� �ڷ��� -> ū �ڷ���
	public void autoCasting() {
		//System.out.println("�� ������ �ܼ�â�� ����غ����� �ǽ� ����!");
		
		// 1. int(����, 4Byte) => double(�Ǽ�, 8Byte)
		
		// ���� ����!�� ���ÿ� �ʱ�ȭ
		int intNum = 10;
		System.out.println(intNum);
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		
		// 2. int(����, 4Byte) -> long(8Byte, ����)
		int bigInteger = 120;
		long smallLong = /*(long)*/bigInteger;
		System.out.println(smallLong);
		
		
		// 3. long(����, 8Byte) -> float(�Ǽ�, 4Byte) ** Ư�����̽�
		
		long longNumber = 1000L;
		//int num = longNumber;
							// promotion XXXXX
							// type casting / type conversion OOO
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		// ������ �Ǽ��� ��ȯ�� �� ū�������� ����Ÿ���� ���� ������ �Ǽ�Ÿ������ ����ȯ
		// 4Byte float���� long������ ǥ���� �� �ִ� ���� ������ �� �б� ����
		
		// 1 2 3
		// 1.00000001, 1.00000002, 1.0000~~~
		
		
		
		System.out.println("-------------------------------------------");
		
		// 4. char(2Byte, ����) -> int(4Byte, ����)
		
		char ch = 'a';
		//System.out.println(ch);
		int num = ch;
		//System.out.println(num);
		char ch2 = 97;
		//System.out.println(ch2);
		
		// ��������
		System.out.println("��������ð�~");
		System.out.println('a');       // a 
		System.out.println((int)'a');  // 97
		System.out.println('a' + 3);   // 100
		System.out.println('a' + '3'); // 148
		System.out.println((int)'3');  // 51
		System.out.println('a' + "3"); // a3
		
		// ---------------------------------------
		
		System.out.println("----------------------");
		
		System.out.println('3');                 // 3   00110011
		System.out.println((char)3);             //    00000011
		System.out.println((char)'3' + (char)3); // 54
		
		System.out.println("----------------------");
		
		System.out.println(3);
		System.out.println('3');
		System.out.println("3");
		
		// ����. byte �Ǵ� short������ ����
		
		// -128 ~ 127
		
		byte byteNum = (byte)128;
		System.out.println(byteNum);
		
		byte b2 = 126;
		byte b3 = 3;
		System.out.println((int)b2 + (int)b3);
		// ������� int�� => ������ġ�� ����ó���ϴ� ũ�Ⱑ int��ũ��(4Byte)
		
		
		// �񱳿�����( == )
		// ���װ� ������ ���� ���ؼ� ������� ��ȯ
		// true / false
		System.out.println("�� �����ڸ� ����غ���~");
		System.out.println(1 == 2);          // false
		System.out.println('a' == 'b');      // false
		System.out.println(2 == (int)'2');   // false
		System.out.println((char)2 == '2');  // false
		System.out.println((int)'2');
		System.out.println((int)'2' == '2'); // true
	}
	
	
	
	// ���� �� ��ȯ : ū ũ���� �ڷ��� -> ���� ũ���� �ڷ���
	public void forceCasting() {
		
		// ����� ����ȯ�̶�� ��
		// (�ٲ��ڷ���)��
		
		// double(8Byte) -> int(4Byte)
		double doubleNum = 10.123123;
		int intNum = (int)doubleNum;
		System.out.println(intNum);
		
		// 0.123213 �� �κ��� ���� -> �������� �ս�
		
		double dNum = intNum;
		System.out.println(dNum);
		
		
	}
	
	
	
	

}
