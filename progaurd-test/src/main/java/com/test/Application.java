package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.inside.Example2;
import com.test.inside.Example3;

public class Application
{
    public static void main(String...strings)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Example e1 = context.getBean("example1", Example1.class);
        Example e2 = context.getBean("example2", Example2.class);
        Example e3 = context.getBean("example3", Example3.class);

        e1.print();
        e2.print();
        e3.print();
        
        context.close();
        
    }
}
