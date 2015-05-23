package com.test.map.single;

import java.io.File;
import java.util.Map;

import net.openhft.chronicle.map.ChronicleMapBuilder;

public class SingleThread
{

    public static void main(String[] args) throws Exception
    {
        File f = new File("/tmp/file.map");
        Map<Integer, String> map = ChronicleMapBuilder.of(Integer.class,
                String.class).
                createPersistedTo(f);
        
//        for(int i = 20; i < 30; i++)
//            map.put(Integer.valueOf(i), String.valueOf(i * (i + 2))); 
        
        System.out.println("Size of the map is : "+map.size());
    }

}
