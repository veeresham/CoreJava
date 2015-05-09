package com.test.thread;

public class MyThread implements Runnable
{
    private boolean running = false;

    public void run()
    {
        int time = 4;
        
        while(time > 0)
        {
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            } 
            
            time--;
        }

    }

    public boolean isRunning()
    {
        return running;
    }

    public void setRunning(boolean running)
    {
        this.running = running;
    }

}
