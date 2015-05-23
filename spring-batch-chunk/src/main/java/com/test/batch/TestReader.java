package com.test.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.test.entity.Source;

public class TestReader implements ItemReader<Source> {
	
	private int count = 10;
	
	private boolean raiseError = false;
	
	private static int internalCount = 0;

	public Source read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		
		if(raiseError)
		{
			System.out.println("Exception occured while reading");
			throw new Exception("New Exception");
		}
		
		internalCount++;
		
		if(internalCount >= count)
		{
			System.out.println("Reached max count "+internalCount);
			return null;
		}
		
		Source source = new Source();
		source.setInput("Input "+internalCount);
		
		System.out.println("Reading item "+internalCount);
		
		return source;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isRaiseError() {
		return raiseError;
	}

	public void setRaiseError(boolean raiseError) {
		this.raiseError = raiseError;
	}
	
}
