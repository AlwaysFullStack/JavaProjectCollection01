package com.examples.testng.techvillege;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"Car"})
	public void Car1() {
		System.out.println("Batch Car - Test car1");
	}
	
	@Test(groups= {"Car"})
	public void Car2() {
		System.out.println("Batch Car - Test car2");
	}
	
	@Test(groups= {"Scooter"})
	public void Scooter1() {
		System.out.println("Batch Scooter - Test Scooter1");
	}
	
	@Test(groups= {"Scooter"})
	public void Scooter2() {
		System.out.println("Batch Scooter - Test Scooter2");
	}
	
	@Test(groups= {"Car","Sedan Car"})
	public void Sedan1() {
		System.out.println("Batch Sedan Car - Test Sedan1");
	}
	
}
