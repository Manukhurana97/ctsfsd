package com;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class matrixaddition 
{
	
	int[][] a1;
	int[][] a2;
	int[][] a3;
	Scanner sc = new Scanner(System.in);

	
	void define(int r, int c) 
	{
		a1 = new int[r][c];
		a2 = new int[r][c];
		a3 = new int[r][c];
	}
	
	public void add_data(int r, int c)
	{
		for(int i=0; i<r; i++) 
		{
			for(int j=0; j<c;j++) 
			{
				System.out.println("Enter data in "+i+ j+ "1st array");
				int da1 = sc.nextInt();
				a1[i][j]=da1;
				
			}
		}
		System.out.println("\n");
		
		for(int i=0; i<r; i++) 
		{
			for(int j=0; j<c;j++) 
			{
				System.out.println("Enter data in "+i+ j+ "2st array");
				int da2 = sc.nextInt();
				a1[i][j]=da2;
				
			}
		}
	}
	
	public void add(int r, int c) 
	{
		for(int i=0; i<r; i++) 
		{
			for(int j=0; j<c;j++) 
			{
				a3[i][j] = a1[i][j]+a2[i][j];
				
			}
		}
	}
	
	public void display(int r, int c) 
	{
		for(int i=0; i<r; i++) 
		{
			for(int j=0; j<c;j++) 
			{
				System.out.println(a3[i][j]);
				
			}
		}
	}
	
	
	
}
