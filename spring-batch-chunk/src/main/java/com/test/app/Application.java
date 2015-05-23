package com.test.app;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;

public class Application {
	public static void main(String...ar) throws Exception
	{
		CommandLineJobRunner.main(new String[] { "spring-config.xml", "anotherJob" }); 
	}
}
