package com.test;

@Obfuscate(enabled=false)
public class Example1 implements Example
{
    private String message;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void print()
    {
        System.out.println(getMessage());
        
    }
    
    
}
