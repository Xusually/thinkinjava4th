package com.pangwenxin.thinkinginjava4.exercise.chapter2;

public class Chapter2Exercise6 {
	private String s = "";
	public void setS(String s) {
		this.s=s;
	}
	public String getS(String s) {
		return this.s;
	}
	public int storage() {
		return this.s.length() * 2;
	}
	public static void main(String[] args) {
		Chapter2Exercise6 c2e6 = new Chapter2Exercise6();
		c2e6.setS("abc中国12345");
		System.out.println(c2e6.storage());
	}
}
