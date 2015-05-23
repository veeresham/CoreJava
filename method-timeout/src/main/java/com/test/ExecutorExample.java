package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorExample
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<Object> task = new Callable<Object>() {
           public Object call() {
              return runMethod(); 
           }
        };
        Future<Object> future = executor.submit(task);
        try {
           Object result = future.get(7, TimeUnit.SECONDS); 
           System.out.println("Retuslt "+result);
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
           future.cancel(true); 
        }
    }

    protected static boolean runMethod()
    {
        try
        {
            Thread.sleep(6000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return true;
    }
}
