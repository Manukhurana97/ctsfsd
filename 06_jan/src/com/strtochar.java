package com;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class strtochar
{
	
	char[] s;
	int countvowels = 0;
	
	
	{
		s = new char[11];
	}
	
	public char[] createchar(String st) {
		
		for(int i=0;i<st.length();i++) 
		{
			s[i] = st.charAt(i);
			
			
		}
		
		return s;
	}
	
	public void display() 
	{
		for(int i=0;i<s.length;i++) 
		{
			if(s[i]=='a'|| s[i]=='e'|| s[i]=='i'||s[i]=='o'||s[i]=='u')
			{
				
				countvowels++;
			}
			System.out.println(s[i]+" ");
			
		}
		System.out.println(countvowels);
		
		
		
	}
	

}


