package com;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class myarray {
	
	private char[] s;
	{
		s = new char[10];
	}
	
	char[] createArray() 
	{
		for(int i=0;i<10;i++) {
			s[i] = (char)('A'+i);
		}
		return s;
	}
	
	public void display() 
	{
		for(int i=0;i<s.length;i++) 
		{
			System.out.println(s[i]+",");
		}
	}

}
