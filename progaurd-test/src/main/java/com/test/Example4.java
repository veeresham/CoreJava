package com.test;

public class Example4 implements Example
{
    @Obfuscate(enabled=false)
    @Override
    public void print()
    {
        System.out.println("In Example4");
    }

}
