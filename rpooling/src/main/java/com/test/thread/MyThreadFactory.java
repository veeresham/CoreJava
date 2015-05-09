package com.test.thread;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

public class MyThreadFactory extends BasePooledObjectFactory<MyThread>
{

    @Override
    public MyThread create() throws Exception
    {
        return new MyThread();
    }

    @Override
    public PooledObject<MyThread> wrap(MyThread arg0)
    {
        return new DefaultPooledObject<MyThread>(arg0);
    }
    
    @Override
    public boolean validateObject(PooledObject<MyThread> p)
    {
        return p.getObject().isRunning();
    }
    
    @Override
    public void activateObject(PooledObject<MyThread> p) throws Exception
    {
        p.getObject().setRunning(true);
    }
    
    @Override
    public void passivateObject(PooledObject<MyThread> p) throws Exception
    {
        p.getObject().setRunning(false);
    }

}
