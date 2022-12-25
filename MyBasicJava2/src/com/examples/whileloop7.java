package com.examples;

public class whileloop7 {

	public static void main(String[] args) {
		int i, j;
		i=1;
		while(i<=5) {
			j=1;
			while(j<=3) {
				System.out.println("Current Value of i: "+i+" and j: "+j);
				j++;
			}
			i++;
		}
	}
}
