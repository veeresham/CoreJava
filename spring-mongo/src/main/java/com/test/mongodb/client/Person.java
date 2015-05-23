package com.test.mongodb.client;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
public class Person
{
    @Id
    private String id;
    private String name;
    private int age;
    private double salary;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    @Override
    public String toString()
    {
        String str = "Person details : [id:%s, name:%s ,age:%d, salary:%f]";
        return String.format(str, id,name,age,salary);
    }

}
