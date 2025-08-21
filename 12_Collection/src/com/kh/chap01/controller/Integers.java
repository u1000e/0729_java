package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {
	
	private int[] integers;
	private int size;
	
	public Integers() {
		integers = new int[3];
	}
	
	public void add(int element) {
		if(integers.length == size + 1) {
			integers = Arrays.copyOf(integers, (integers.length * 2));
		}
		integers[size++] = element;
	}
	
	public int get(int index) {
		if(integers[index] == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return integers[index];
	}
	
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
        if (integers == null)
            return "null";
        int iMax = integers.length - 1;
        if (iMax == -1)
            return "[]";
        
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < size; i++) {
            b.append(integers[i]);
            if (i+1 == size) {
            	return b.append(']').toString();
            }
            b.append(", ");
        }
        return null;
	}

}
