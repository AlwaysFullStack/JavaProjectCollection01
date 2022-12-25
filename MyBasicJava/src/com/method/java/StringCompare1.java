package com.method.java;

public class StringCompare1 {

	public static void main(String[] args) {
		String stName1, stName2;
		stName1="Today is Wednesday";//A=65, a=97
		stName2="today is wednesday";
		
		//System.out.println(stName1.compareTo(stName2));
		
		/*if(stName1.compareTo(stName2)==0) {
			System.out.println("Strings are identical");
		}else {
			System.out.println("Strings are not identical");
		}*/
		
		//System.out.println(stName1.compareToIgnoreCase(stName2));
		if(stName1.compareTo(stName2)==0) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		
		
	}

}
