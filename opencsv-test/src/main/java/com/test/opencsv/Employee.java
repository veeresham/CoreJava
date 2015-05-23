package com.test.opencsv;

public class Employee
{
    private String name;
    private int age;
    private double salary;
    private String address;

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

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    
    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name : "+name);
        buffer.append("; Age : "+age);
        buffer.append("; Salary : "+salary);
        buffer.append("; Addresss : "+address);
        return buffer.toString();
    }

}
