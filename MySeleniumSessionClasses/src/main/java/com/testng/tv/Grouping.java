package com.testng.tv;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="Car")
	public void Car1 () {
		System.out.println("this is carone");
	}
	@Test(groups="Car")
	public void Car2 () {
	    System.out.println("this is cartwo");
	}
	@Test(groups= {"Car","Sedan"})
    public void Sedan1 () {
	    System.out.println("this is Sedanone");
	}			
	@Test(groups= {"Car","Sedan"})
	public void Sedan2 () {
	    System.out.println("this is Sedantwo");
	}				
	@Test(groups="Scooter")
	public void Scooter1 () {
	   System.out.println("this is Scooterone");
    }
}
