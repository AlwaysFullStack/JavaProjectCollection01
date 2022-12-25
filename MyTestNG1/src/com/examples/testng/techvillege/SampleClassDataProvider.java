package com.examples.testng.techvillege;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleClassDataProvider {
	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod(){
		//return new Object[][] {{"Jannat Al Nayeem"},{"Rahman Kazi"},{"Kazi Iqbal"}};
		//return new Object[][] {{"name1","jannat"},{"name2","rahman"}};
		return new Object[][] {{ "testuser_1", "Test@123" }};
	}
	
  @Test(dataProvider="data-provider")
  public void testMethod(String[] data) {
	  System.out.println("Data1 :"+data[1]);
  }
}
