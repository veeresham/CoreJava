package com.test;

import com.google.gson.Gson;


public class Test
{

    public static void main(String[] args) throws Exception
    {
        Message m = new Message();
        m.setMessage("Sample Message ");
        m.setName("Name of the message");
        m.addProperty("p1", "p1Vlaue");
        m.addProperty("p2", "p2value");
        m.addProperty("p3", "p3Vlaue");
        m.addProperty("p4", "p4Vlaue");
        
        Gson gson = new Gson();
        String json = gson.toJson(m); 
        
        System.out.println(json);
        
        String s1 = "{\"name\":\"Second name of the message\",\"properties\":{\"p4\":\"p4Vlaue\","
                + "\"p3\":\"p3Vlaue\",\"p2\":\"p2value\",\"p1\":\"p1Vlaue\"},\"message\":\"Sample Message \"}";
        
        Message m2 = gson.fromJson(s1, Message.class);
        
        System.out.println(m2);

    }

}
