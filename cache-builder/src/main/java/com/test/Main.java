package com.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.test.cache.Person;

public class Main
{

    public static void main(String[] args) throws ExecutionException
    {
        CacheLoader<String, Person> loader = new CacheLoader<String, Person>()
        {
            public Person load(String key) throws Exception
            {
                return getPerson(key);
            }
        };
        LoadingCache<String, Person> persons = CacheBuilder.newBuilder()
                .initialCapacity(80)
                .maximumSize(20)
                .refreshAfterWrite(20, TimeUnit.HOURS)
                .expireAfterAccess(1, TimeUnit.DAYS)
                .recordStats()
                .build(loader);

        Person p = new Person();
        p.setName("Joe");
        p.setLocation("New Yrok");
        persons.put("P1", p);

        System.out.println("Size of Cache is : " + persons.size());

        Person p1 = new Person();
        p1.setName("Joy");
        p1.setLocation("New Jersy");
        persons.put("P2", p1);

        System.out.println("Size of Cache is : " + persons.size());

        Person d1 = persons.get("P1");
        System.out.println("Person is : " + d1.getName());

        System.out.println("Size of Cache is : " + persons.size());

        persons.cleanUp();

        System.out.println("Size is : " + persons.size());

//        CacheStats t = persons.stats();
//
//        persons.invalidateAll();
//        System.out.println("Size is : " + persons.size());
//        
//        persons.invalidate("P1");
//
//        CacheBuilderSpec spec = CacheBuilderSpec
//                .parse("initialCapacity=10,maximumSize=20,refreshInterval=2000s");
//        LoadingCache<String, Person> p2 = CacheBuilder.from(spec).build(loader);
        
        

    }

    protected static Person getPerson(String key)
    {
        return null;
    }

}
