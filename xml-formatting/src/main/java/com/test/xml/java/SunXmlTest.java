package com.test.xml.java;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

public class SunXmlTest
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
            final InputSource src = new InputSource(new StringReader(input));
            final Node document = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(src).getDocumentElement();

            final DOMImplementationRegistry registry = DOMImplementationRegistry
                    .newInstance();
            final DOMImplementationLS impl = (DOMImplementationLS) registry
                    .getDOMImplementation("LS");
            final LSSerializer writer = impl.createLSSerializer();

            writer.getDomConfig().setParameter("format-pretty-print",
                    Boolean.TRUE);
            writer.getDomConfig().setParameter("xml-declaration", true);

            return writer.writeToString(document);
        } catch (Exception e)
        {
            e.printStackTrace();
            return input;
        }

    }
}
