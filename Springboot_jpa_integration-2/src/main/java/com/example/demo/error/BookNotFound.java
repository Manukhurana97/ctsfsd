package com.example.demo.error;

@SuppressWarnings("serial")
public class BookNotFound extends RuntimeException {
	
	public String mgs;

	public BookNotFound(String mgs) {
		super();
		this.mgs = mgs;
	}
	
	
	public String printmgs()
	{
		return mgs;
	}
	
}
