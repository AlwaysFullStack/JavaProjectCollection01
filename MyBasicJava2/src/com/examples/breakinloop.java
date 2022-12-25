package com.examples;

public class breakinloop {

	public static void main(String[] args) {
		// brake in loop
		int sum=0;
		
		for(int i=1; i<=20; i++) {
			sum+=i;
			if (sum>=45) {
				break;
			}
			System.out.println("Current Loop Value: "+i);
		}
		System.out.println("Reult: "+sum);

	}

}
