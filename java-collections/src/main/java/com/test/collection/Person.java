package com.test.collection;

public class Person implements Comparable<Person>
{
    private long id;

    public Person(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public int compareTo(Person o)
    {
        return (int) (getId() - o.getId());
    }
}
