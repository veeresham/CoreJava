package com.test.cache.listener;

import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import com.test.cache.Person;

public class CahceRemoveListener implements RemovalListener<String, Person>
{

    public void onRemoval(RemovalNotification<String, Person> arg0)
    {
       System.out.println("Removed : "+arg0.getKey());
        
    }

}
