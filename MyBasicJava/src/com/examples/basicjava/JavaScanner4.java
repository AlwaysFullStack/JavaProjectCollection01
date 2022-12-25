package com.examples.basicjava;

import java.util.Scanner;

public class JavaScanner4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		
		int myNum1;
		//myNum1=109;
		
		//System.out.println("myNum1 contains: "+myNum1);
		System.out.println("Enter any number:");
		myNum1=scanner.nextInt();
		System.out.println("myNum1 contains: "+myNum1);

	}

}
