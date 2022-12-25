package com.examples.testng.techvillege;

import org.testng.annotations.Test;

public class MyTest8 {
	@Test
	public void setUp() {
		System.out.println("System is ready");
	}
	
	@Test(timeOut=2000)
	public void testTimeout() throws InterruptedException{		
		Thread.sleep(3000);
		System.out.println("System timeout test");
	}
  
}
