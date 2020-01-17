package com.mycompany.Spring_project2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Swimming implements coach {
	private String 	email;
	private String age;
	
	private FortuneService fortuneservice;
	
	private Swimming()
	{
		System.out.println("Swimming default constructor");
	}
	
	private void setfortuneservice()
	{
		System.out.println("");
	}
	
	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "practise 48 hrs daily";
	}
	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	

}
