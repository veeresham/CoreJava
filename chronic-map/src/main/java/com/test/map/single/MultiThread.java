package com.test.map.single;

import java.io.File;
import java.util.Map;

import net.openhft.chronicle.map.ChronicleMapBuilder;

public class MultiThread
{
    public static void main(String...strings) throws Exception
    {
        MultiThread mt = new MultiThread();
        mt.run();
    }
    
    public void run() throws Exception
    {
        Map<Integer,String> rMap = ChronicleMapBuilder.of(Integer.class,
                String.class).
                entries(2000).
                createPersistedTo(new File("/tmp/file.map"));
        
        Map<Integer,String> wMap = ChronicleMapBuilder.of(Integer.class,
                String.class).
                createPersistedTo(new File("/tmp/heap.file.map"));
        
        Thread wThread = new Thread(new WritingThread(wMap, 20));
        wThread.start();
        
        Thread.sleep(2000);
        
        Thread rThread = new Thread(new ReadingThread(rMap, 20));
        rThread.start();
        
        
        rThread.join();
        wThread.join();
    }
    
    class WritingThread implements Runnable
    {
        private Map<Integer, String> map;
        
        private int i;
        
        public WritingThread(Map<Integer,String> map, int i)
        {
            this.map = map;
            this.i = i;
        }
        
        public void run()
        {
            for(int j=1; j<=10; j++)
            {
                String v= String.valueOf(j*j + 10);
                System.out.println("{Writing} Inserting value for Index "+j*i+" ; value : "+v);
                map.put(j*i, v);
            }
        }
    }
    
    class ReadingThread implements Runnable
    {
        private Map<Integer, String> map;
        
        private int i;
        
        public ReadingThread(Map<Integer,String> map, int i)
        {
            this.map = map;
            this.i = i;
        }
        
        public void run()
        {
            for(int j=1; j<=10; j++)
            {
                Integer k = j*i;
                System.out.println("{Reading} Key : "+k+" : Vlaue = "+map.get(k));
            }
        }
    }
}
