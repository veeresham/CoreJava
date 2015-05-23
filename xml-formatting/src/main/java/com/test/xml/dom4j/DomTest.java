package com.test.xml.dom4j;

import java.io.StringWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DomTest
{

    public static void main(String[] args) throws Exception
    {
        String input = "<xml-tag attrid=\"attrib-value\"><inner-tag>tagValue</inner-tag></xml-tag>";
        
        System.out.println(formatXML(input));
    }
    
    public static String formatXML(String input)
    {
        try 
        {
            Document doc = DocumentHelper.parseText(input);  
            StringWriter sw = new StringWriter();  
            OutputFormat format = OutputFormat.createPrettyPrint();  
            format.setIndent(true);
            format.setIndentSize(3); 
            XMLWriter xw = new XMLWriter(sw, format);  
            xw.write(doc);  
            
            return sw.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return input;
        }
        
    }

}
