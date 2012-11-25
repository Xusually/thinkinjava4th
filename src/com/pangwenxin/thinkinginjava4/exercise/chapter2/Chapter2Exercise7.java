package com.pangwenxin.thinkinginjava4.exercise.chapter2;

public class Chapter2Exercise7 {
	public static void main(String[] args) {
		//First,call the static method in a normal way
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.println(StaticTest.i);
		//Then,call the static method in a static way to avoid the warning
		Incrementable.increment();
		System.out.println(StaticTest.i);
		//check the result
	}
}
