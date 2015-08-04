package com.test.inside;

import java.io.Serializable;

import com.test.Example;
import com.test.Obfuscate;

@Obfuscate(enabled=false)
public class Example3 implements Serializable, Example
{
    private static final long serialVersionUID = 7151031288624192358L;
    
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
