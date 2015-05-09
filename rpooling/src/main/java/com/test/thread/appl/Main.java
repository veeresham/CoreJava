package com.test.thread.appl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import com.test.thread.Consumer;
import com.test.thread.MyThread;
import com.test.thread.MyThreadFactory;

public class Main
{

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception
    {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxTotal(3);
        config.setBlockWhenExhausted(true);
        config.setMaxWaitMillis(10 * 1000);
        
        MyThreadFactory factory = new MyThreadFactory();
        GenericObjectPool<MyThread> pool = new GenericObjectPool<MyThread>(factory, config);
        
        ExecutorService e = Executors.newFixedThreadPool(10);
        List<Future> f = new ArrayList<Future>();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Getting the object "+i);
            Future a = e.submit(new Consumer(i,pool));
            f.add(a);
        }
        
        label: for(Future s : f)
        {
            if(!s.isDone())
                continue label;
        }
        
        System.out.println("Main methods completed");
        
    }

}
