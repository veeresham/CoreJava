package com.test.inside;

import com.test.Example;
import com.test.Obfuscate;

@Obfuscate(enabled=false)
public class Example2 implements Example
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
