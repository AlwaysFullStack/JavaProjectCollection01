package com.examples.basicjava;

import java.util.Scanner;

public class JavaScanner2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int myNum1;
		
		System.out.print("Reading a number:");
		myNum1=scanner.nextInt();
		
		System.out.println("You entered: "+myNum1);
		
		int myResult;
		myResult=myNum1*2;
		
		System.out.println("Calculated Value: "+myResult);
		
	}

}
