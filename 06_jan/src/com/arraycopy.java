package com;

public class arraycopy 
{
	
	public static void main(String[] args) 
	{
	
		int[] arr = {1,2,3,4,5,6};
		
		int[] hold = {1,2,3,4,5,6,7,8,9};
		
		System.arraycopy(arr, 0, hold, 0, arr.length);
		
		for (int a :hold) 
		{
			System.out.println(a);
		}
	
	}
}
