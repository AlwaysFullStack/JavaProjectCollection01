package com.examples;

import java.util.Scanner;

public class MyScanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int myNum1, myNum2, myNum3;
		
		System.out.println("Reading First Number:");
		myNum1=scanner.nextInt();
		
		System.out.println("Reading Second Number:");
		myNum2=scanner.nextInt();
		
		System.out.println("Reading Third Number:");
		myNum3=scanner.nextInt();
		
		System.out.println("Numbers are:"+myNum1+", "+myNum2+", "+myNum3);
		
		String name=scanner.nextLine();
	}
}