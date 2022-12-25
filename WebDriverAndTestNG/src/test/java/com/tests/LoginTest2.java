package com.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoginTest2 {
	Logger log = Logger.getLogger(LoginTest2.class);
	@Test 
	public void LogginTest() {
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	}
}