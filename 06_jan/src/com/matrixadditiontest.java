package com;

import java.util.Scanner;

public class matrixadditiontest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row ");
		int row = sc.nextInt();
		
		System.out.println("Enter col ");
		int col = sc.nextInt();
		
		
		matrixaddition mat = new matrixaddition();
		mat.define(row, col);
		mat.add_data(row, col);
		mat.add(row, col);
		mat.display(row, col);
		

	}

}
