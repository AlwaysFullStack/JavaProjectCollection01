package com.examples.basicjava;

public class whileinjava3 {

	public static void main(String[] args) {
		int i, sum;
		i=1;
		sum=0;
		
		while(i<10) {
			sum+=i;
			i++;//2
		}
		
		System.out.println("Calculated sum: "+sum);
	}
}
