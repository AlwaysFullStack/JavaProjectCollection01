package com.examples.testng.techvillege;

import org.testng.annotations.Test;

public class MyTest7 {
	int ln=0;
	
	  @Test(enabled=false)
	  public void TestLogon() {
		  int i=0;
		  while(i<10) {
			  System.out.println("Invocation Count");
			  i++;
		  }
	  }
	  
	  @Test(invocationCount=10)
	  public void invocationTest() {
		  System.out.println((ln++)+" New Invocation Count");
	  }
}
