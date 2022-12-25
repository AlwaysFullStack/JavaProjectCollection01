package com.examples.basicjava;

public class JavaInteger01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Example of integer
		 Second line
		 Third Line
		 */
		
		int carSpeed; //declare
		
		carSpeed=20; //assign
		
		System.out.println("Current speed:"+carSpeed); //concat
		
		int roadSpeed;
		roadSpeed=25;
		System.out.println("Road allows:"+roadSpeed);
		
		System.out.println("Current speed:"+carSpeed+" "+"Road allows:"+roadSpeed);
		
		//carSpeed=25;
		carSpeed=carSpeed+5;
		System.out.println("Current speed:"+carSpeed); 
		
		carSpeed+=5;//carSpeed=carSpeed+5;
		System.out.println("Current speed:"+carSpeed);
		
		carSpeed-=10;//carSpeed=carSpeed+5;
		System.out.println("Current speed:"+carSpeed);

	}

}
