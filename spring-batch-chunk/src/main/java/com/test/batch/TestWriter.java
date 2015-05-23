package com.test.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.test.entity.Destination;

public class TestWriter implements ItemWriter<Destination> {

	public void write(List<? extends Destination> arg0) throws Exception {
		
		for(Destination dest : arg0)
		{
			System.out.println("Writing : "+dest.getOutput());
		}
		
		System.out.println("Finished Writing");
	}

}
