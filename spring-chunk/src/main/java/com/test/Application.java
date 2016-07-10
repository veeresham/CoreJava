package com.test;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;

public class Application
{
    public static void main(String... strings) throws Exception
    {
//        CommandLineJobRunner.main(new String[] { "spring-config.xml",
//                "sucessJob" });
        
        CommandLineJobRunner.main(new String[] { "spring-config.xml",
        "anotherJob" });
    }
}
