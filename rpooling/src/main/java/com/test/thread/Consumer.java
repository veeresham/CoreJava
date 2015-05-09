package com.test.thread;

import org.apache.commons.pool2.impl.GenericObjectPool;

public class Consumer implements Runnable
{

    GenericObjectPool<MyThread> pool;
    int i;

    public Consumer(int i, GenericObjectPool<MyThread> pool)
    {
        this.i = i;
        this.pool = pool;
    }

    public void run()
    {
        MyThread m = null;
        try
        {
            m = pool.borrowObject();
            System.out.println("Started " + i);
            Thread t = new Thread(m);
            t.start();
            while (t.isAlive());
            System.out.println("Completed " + i);
        } catch (Exception e)
        {
            System.out.println("Exception while getting the object " + i);
            e.printStackTrace();
        }
        if (m != null)
            pool.returnObject(m);
    }

}
