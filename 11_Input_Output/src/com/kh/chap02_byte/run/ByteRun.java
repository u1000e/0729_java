package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {
		
		FileByteDao fbd = new FileByteDao();
		// fbd.outputToFile();
		fbd.inputFromFile();

	}

}
