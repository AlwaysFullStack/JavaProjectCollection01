package com.examples.testng.techvillege;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jDemo {
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	@Test
	public void TestCase1() {
		System.out.println("\nHello World\n");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		System.out.println("\nCompleted\n");
	}
}
