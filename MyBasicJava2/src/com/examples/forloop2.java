package com.examples;

public class forloop2 {

	public static void main(String[] args) {
		// Add integers divisible by 3
		
		int sum=0;
		
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		
		System.out.println("Total: "+sum);
	}
}
