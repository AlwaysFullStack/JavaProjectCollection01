package com.examples;

public class array01 {

	public static void main(String[] args) {
		 String[] cars=new String[] {"Lexus","Bmw", "Toyota", "Nissan", "Honda", "Audi"};
		 
		 System.out.println(cars[3]);
		 
		 System.out.println("Number of items: "+cars.length);
		 
		 int i=0;
		 //System.out.println(cars[i]);
		 
		 //i++;
		 //System.out.println(cars[i]);
		 while(i<cars.length) {
			 System.out.println(cars[i]);
			 i++;
		 }
		 
		 
	}

}
