package com.test.batch;

import org.springframework.batch.item.ItemProcessor;

import com.test.entity.Destination;
import com.test.entity.Source;

public class TestProcessor implements ItemProcessor<Source,Destination>
{

    public Destination process(Source source) throws Exception
    {
        Destination destination = new Destination();
        destination.setOutput(source.getInput().replace("Input", "Output"));
        System.out.println("Converted " + source.getInput() + " to "
                + destination.getOutput());
        return destination;
    }


}