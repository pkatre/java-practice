package com.practice1.java;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();  // constructor called
		Test1 test1 = new Test1(); // constructor called
		
		Test1 test2 = new Test1(90);
		test2.showMarks();// output: marks are 90
		
		TestB obj = new TestB();
		
		obj.childBMethod(); //output: Child B class method
		
		System.out.println(obj.add(50,900));//output: 950
		
      System.out.println(test.m3(test.m2(), test.m2())); // output 11 11 33 11 45
      
      
      int a = 10;
      double d = 5.5;
      System.out.println(a+d); //output: 15.5
      
      
      int x=10;
      System.out.println(test.x);//output: 20
      
      test.show();// java
      test.show();// java
      
      System.out.println(test.add(10, 40));//output: 50
      
      System.out.println(test.getMarks()); //output: 100
      
   
  	}

}


//output
//Static block
//block
//constructor called
//block
//constructor called
//block
//Marks are 90
//block
//constructor called
//Child B class method
//950
//11
//11
//33
//11
//45
//15.5
//20
//java
//java
//50
//100

