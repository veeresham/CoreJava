package com.test;

import java.util.HashMap;
import java.util.Map;

public class Message
{
    private String name;
    private Map<String,String> properties;
    private String message;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Map<String, String> getProperties()
    {
        return properties;
    }
    public void setProperties(Map<String, String> properties)
    {
        this.properties = properties;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public void addProperty(String k,String v)
    {
        if(properties == null)
            properties = new HashMap<String, String>();
        properties.put(k, v);
    }
}
