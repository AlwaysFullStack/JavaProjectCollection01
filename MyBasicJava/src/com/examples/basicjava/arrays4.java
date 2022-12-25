package com.examples.basicjava;

public class arrays4 {

	public static void main(String[] args) {
		int[] myNum=new int[] {56, 54, 34, 91, -1, 3, 209, 10, 25};
		int noe=myNum.length;
		int ln=1;
		for(int i=noe-1; i>=0; i--) {
			System.out.println(ln+". Current Value:"+myNum[i]);
			ln++;
		}
		
		//
		

	}

}
