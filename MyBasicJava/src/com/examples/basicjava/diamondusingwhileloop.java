package com.examples.basicjava;

public class diamondusingwhileloop {

	public static void main(String[] args) {
		int i, j, row;
		
		row=7;
		i=0;
		while (i<=row) {
			j=1;
			while(j<=row-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=(2*i)-1) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
		}
		i=row-1;
		while(i>=1) {
			j=1;
			while(j<=row-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=(2*i)-1) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i--;
		}

	}

}
