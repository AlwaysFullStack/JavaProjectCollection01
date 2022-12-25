package com.examples;

public class MyInt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int carSpeed;
		
		carSpeed=20;
		System.out.println("Current Speed: "+carSpeed);
		
		carSpeed=25;
		System.out.println("Current Speed: "+carSpeed);
		
		carSpeed=carSpeed+10;
		System.out.println("Current Speed: "+carSpeed);
		
		carSpeed += 10; //carSpeed=carSpeed+10;
		System.out.println("Current Speed: "+carSpeed);
	}

}
