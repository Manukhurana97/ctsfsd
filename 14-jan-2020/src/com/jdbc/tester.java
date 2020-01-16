package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tester {
	private static CustomerService service;
	static {
		service = new cusSerInm();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
		int choice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. create customer");
			System.out.println("2. display all customers");
			System.out.println("3. find customer by id");
			System.out.println("4. update customer");
			System.out.println("5. delete customer");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print(" First Name: ");
				String Name=br.readLine().toString();
				
				System.out.print(" Email: ");
				String email=br.readLine().toString();
				customer customer=service.createCuastomer(Name, email);
				System.out.println("Create Customer Sucess "+customer);
				break;
			case 2:
				System.out.println("displaying all data");
				ResultSet rs = (ResultSet) service.displayall();
				while(rs.next())
				{
					System.out.println(rs.getString("name")+rs.getString("email"));
				}
//			case 3:
//				System.out.println("Enter User name");
//				String Stname = br.readLine();
//				
				
				
				
			case 0:
				System.exit(0);
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}
}
