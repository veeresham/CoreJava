package com.test;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample extends TimerTask
{

    private int status;

    static final int COMPLETED = 1;

    static final int RUNNING = 2;

    static final int IDLE = 3;

    public TimerExample()
    {
        setStatus(IDLE);
    }

    public static void main(String[] args) throws Exception
    {
        Timer t = new Timer(true);
        TimerExample e = new TimerExample();
        t.schedule(e, 0);
        System.out.println("Started Timer");
        Thread.sleep(3300);
        if (e.getStatus() == RUNNING)
            e.cancel();
        t.cancel();
        System.out.println("Completed Timer");
    }

    public void run()
    {
        setStatus(RUNNING);
        try
        {
            System.out.println("Method run() Started ");
            Thread.sleep(3000);
            System.out.println("Completed run() Method");

        } catch (InterruptedException e)
        {
            System.out.println("Interruped");
        }
        setStatus(COMPLETED);
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

}
