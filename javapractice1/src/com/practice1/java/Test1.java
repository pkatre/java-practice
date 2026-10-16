package com.practice1.java;

public class Test1 {
	{
		System.out.println("block");
	}
	
	static{
		System.out.println("Static block");
	}
	
	int x=20;
	
	
	int marks;
	private int marks1 = 100;
	
	Test1(){
		System.out.println("constructor called");
	}
	
	Test1(int a){
		this.marks = a;
	}
	
	int m2() {
		System.out.println(11);
		return 45;
	}
	
	int m2(int y) {
		System.out.println(22);
		return m2();
	}
	
	int m3(int y, int z) {
		System.out.println(33);
		return m2();
	}
	
	
	void show() {
		System.out.println("java");
	}
	
	int add (int a,int b) {
		return a+b;
	}
	
	void showMarks() {
		System.out.println("Marks are "+ marks);
	}
	
	public int getMarks() {
		return marks1;
	}
	
}



