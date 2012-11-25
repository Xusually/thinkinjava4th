package com.pangwenxin.thinkinginjava4.exercise.chapter2;

public class Chapter2Exercise5 {
	public static void main(String[] args) {
		DataOnly doy = new DataOnly();
		System.out.println("===before===");
		System.out.println(doy.i);
		System.out.println(doy.d);
		System.out.println(doy.b);
		System.out.println("===after===");
		doy.i=2;
		doy.d=3.4;
		doy.b=false;
		System.out.println(doy.i);
		System.out.println(doy.d);
		System.out.println(doy.b);
	}
}
