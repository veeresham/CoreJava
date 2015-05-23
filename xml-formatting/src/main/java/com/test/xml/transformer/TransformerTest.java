package com.test.xml.transformer;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class TransformerTest
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
            Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(
                    "{http://xml.apache.org/xslt}indent-amount", "3");

            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(parseXml(input));
            transformer.transform(source, result);
            return result.getWriter().toString();
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
