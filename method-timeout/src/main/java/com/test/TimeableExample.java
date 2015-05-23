package com.test;

import java.util.concurrent.TimeUnit;

import com.jcabi.aspects.Timeable;

public class TimeableExample
{
    public static void main(String[] args)
    {
        runExample();
    }

    @Timeable(limit = 5, unit = TimeUnit.MILLISECONDS)
    private static void runExample()
    {
        System.out.println("Started");
        try
        {
            Thread.sleep(6000);
            Thread.currentThread();
            if (Thread.interrupted())
            {
                throw new IllegalStateException("time out");
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Completed");

    }
}
