package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CollectionSort
{

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2);
        list.add(35);
        list.add(90);
        list.add(32);
        System.out.println("Elements before sorting : ");
        for (Integer i : list)
            System.out.print(" " + i);
        Collections.sort(list);
        System.out.println("\nElements after sorting : ");
        for (Integer i : list)
            System.out.print(" " + i);
        
        HashMap map = new HashMap<String,String>();
    }

}
