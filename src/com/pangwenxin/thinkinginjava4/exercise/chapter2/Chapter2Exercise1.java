package com.pangwenxin.thinkinginjava4.exercise.chapter2;

public class Chapter2Exercise1 {
	private int intData;
	private char charData;
	public void getIntData() {
		System.out.println(this.intData);
	}
	public void getCharData() {
		System.out.println(this.charData);
	}
	public static void main(String[] args) {
		Chapter2Exercise1 c2e1 = new Chapter2Exercise1();
		//check the default value of int and char type
		c2e1.getIntData();
		c2e1.getCharData();
	}
}
