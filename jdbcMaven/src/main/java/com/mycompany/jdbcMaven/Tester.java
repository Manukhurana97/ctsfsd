package com.mycompany.jdbcMaven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class Tester {
	
	static carservice crs;
	static ResultSet rs;
	static
	{
		crs = new carserviceimp();
	}
	
	public static void main(String[] args) throws IOException, SQLException {
		int choice;
		
		List<car> lst = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		do {
			System.out.println("1. create car");
			System.out.println("2. display car");
			System.out.println("3. display by id");
			System.out.println("4. delete by id");
			System.out.println("5. update by id");
			
			System.out.println("0. exit");
			System.out.print("choice: ");
		
			choice = Integer.parseInt(br.readLine().toString());
			
			switch (choice) 
			{
			
			case 1:
				System.out.print(" Car name ");
				String cn=br.readLine();
				
				System.out.print(" Car price ");
				String cp=br.readLine();
				
				System.out.print(" model: ");
				String cm=br.readLine();
				
				String cid = UUID.randomUUID().toString();
				
				System.out.print(" stock: ");
				int cstock=br.read();
			
				try 
				{
					car cr = crs.insertdata(cn, cp, cm, cid, cstock);
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println(e.toString());
					e.printStackTrace();
				}
				
				System.out.println("inserted Successfully");
				
				break;
			

			case 2:
				System.out.println("displaying all data");
				ResultSet rs = (ResultSet) crs.displayall();
				while(rs.next())
				{
					System.out.println(rs.getString("name")+" " +rs.getString("price")+" "+ rs.getString("model")+" "+rs.getString("carid"));
				}
				break;
				
			case 3:
				System.out.println("enter id to display");
				String id = br.readLine();
				car c = null;
				 c = crs.displaybyid(id);
					
				if(c==null)
				{
					System.out.println("no data found");}
				else
				{
					System.out.println(c);
				}
				
				break;
				
			case 4:
				System.out.println("enter the id to get deleted: ");
				String id1 = br.readLine();
				
				
				crs.deletebyid(id1);
				break;
				
			case 5:
				System.out.println("enter id to update data: ");
				String id2 = br.readLine();
				
				System.out.print(" Car name ");
				String cn1=br.readLine();
				
				System.out.print(" Car price ");
				String cp1=br.readLine();
				
				System.out.print(" model: ");
				String cm1=br.readLine();
				
				System.out.print(" stock: ");
				int cstock1 = br.read();
				
				
				crs.updatebyid(id2,cn1, cp1, cm1, cstock1);
				break;
				
			case 0:
				System.exit(0);
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}

}