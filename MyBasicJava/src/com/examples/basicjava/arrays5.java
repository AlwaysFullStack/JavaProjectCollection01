package com.examples.basicjava;

public class arrays5 {

	public static void main(String[] args) {
		int[] myNum=new int[] {56, 54, 34, 91, -1, 3, 209, 10, 25};
		int noe=myNum.length;
		int myMax=0;
		for(int i=0; i<noe; i++) {
			if(i==0) {
				myMax=myNum[i];
			}else {
				if(myMax<myNum[i]) {
					myMax=myNum[i];
				}
			}
		}
		
		System.out.println("The Max: "+myMax);
		
		//
		

	}

}
