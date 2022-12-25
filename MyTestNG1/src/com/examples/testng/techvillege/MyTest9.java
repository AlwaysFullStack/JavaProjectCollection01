package com.examples.testng.techvillege;

import org.testng.annotations.Test;

public class MyTest9 {
	@Test
	public void setUp() {
		System.out.println("System is ready");
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void testExpectedException(){		
		//System.out.println("System timeout test");
		String myVar="105V";
		Integer.parseInt(myVar);
	}
}
