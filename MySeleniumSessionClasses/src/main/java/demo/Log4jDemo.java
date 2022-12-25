package demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jDemo {
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		System.out.println("\nHello World\n");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		System.out.println("\nCompleted\n");
		

	}

}
