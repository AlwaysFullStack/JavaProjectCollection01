package com.examples.testng.techvillege;

import org.testng.annotations.Test;

public class MyTest6 {
	@Test(priority=0)
	  public void TestLogon() {
		  System.out.println("My Logon");
	  }
	  
	  @Test(priority=1, enabled=true)
	  public void CheckingAccountBalance() {
		  System.out.println("My Checking Account Balance");	  
		  	  
	  }
	  
	  @Test(priority=2)
	  public void SavingAccountBalance() {
		  System.out.println("My Saving Account Balance");	  
		  	  
	  }
	  
	  @Test(priority=3)
	  public void CreditAccountBalance() {
		  System.out.println("My Credit Account Balance");	  
		  	  
	  }
}
