package com.examples.basicjava;

import java.util.Scanner;

public class JavaScanner3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int myNum1, myNum2;
		int myResult;
		
		System.out.print("Enter First Number:");
		myNum1=scanner.nextInt();
		
		System.out.print("Enter Second Number:");
		myNum2=scanner.nextInt();
		
		System.out.println("First Number:"+myNum1);
		System.out.println("Second Number:"+myNum2);
		
		myResult=myNum1+myNum2;
		System.out.println("Addition of two values: "+myResult);
		
		
	}

}
