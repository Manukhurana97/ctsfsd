package com.example.demo.error;

public class ErrorMgs {
	
	private String mgs;
	private long time;
	private int status;
	
	public ErrorMgs() {
		super();
	}

	public ErrorMgs(String mgs, long time, int status) {
		super();
		this.mgs = mgs;
		this.time = time;
		this.status = status;
	}

	public String getMgs() {
		return mgs;
	}

	public void setMgs(String mgs) {
		this.mgs = mgs;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
