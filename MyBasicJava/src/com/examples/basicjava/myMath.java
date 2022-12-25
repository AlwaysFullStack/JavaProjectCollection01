package com.examples.basicjava;

public class myMath {

	public static void main(String[] args) {
		int myNum1, myNum2, myRes;
		myNum1=15;
		myNum2=5;
		
		//	+, -, *, /
		// 10%3=1
		
		//Addition
		myRes=myNum1+myNum2;
		System.out.println("Addition: "+myRes);
		System.out.println("Subtraction: "+(myNum1-myNum2));
		System.out.println("Multiplication: "+(myNum1*myNum2));
		System.out.println("Divition: "+(myNum1/myNum2));
		
		myNum1=16;
		myRes=myNum1%myNum2;
		System.out.println("Remainder:"+myRes);
	}

}
