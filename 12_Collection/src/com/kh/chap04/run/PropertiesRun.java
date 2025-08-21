package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {
	
	public static void main(String[] args) {
		
		// Properties : Map계열 -> Key + Value세트로 저장함
		// 외부파일에 입/출력을 하기위한 용도
		// => .properties파일로 입/출력
		// 변경하지 않는 설정정보
		// 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		Properties prop = new Properties();
		// MyProperties myProp = new MyProperties();
		// prop.put("키", new Fish());
		// myProp.put
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		
		try {
			// store(OutputStream os, String comment) : 파일에 출력할때 씀
			//prop.store(new FileOutputStream("test.properties"), "쓰고싶은거");
			
			// 입력
			// load(inputStream is) : 입력 받을 때 씀
			// prop.load(new FileInputStream("test.properties"));
			// System.out.println(prop.get("Map"));
			
			
			// XML로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), null);
			
			// XML에서 입력 loadFromXML(InputStream is);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
