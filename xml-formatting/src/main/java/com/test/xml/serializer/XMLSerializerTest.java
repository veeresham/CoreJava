package com.test.xml.serializer;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLSerializerTest
{
    public static void main(String... strings) throws Exception
    {
        String input = "<xml-tag attrid=\"attrib-value\"><inner-tag>tagValue</inner-tag></xml-tag>";
        System.out.println(formatXML(input));
    }

    public static String formatXML(String input)
    {
        try
        {
            final Document document = parseXml(input);
            OutputFormat format = new OutputFormat(document);
            format.setLineWidth(65);
            format.setIndenting(true);
            format.setIndent(3);
            Writer out = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(out, format);
            serializer.serialize(document);
            return out.toString();
        } catch (Exception e)
        {
            e.printStackTrace();
            return input;
        }
    }

    private static Document parseXml(String in)
    {
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            return db.parse(is);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
