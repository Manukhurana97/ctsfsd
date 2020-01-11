package col;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		
		 
		 List<employee> lst = new ArrayList<employee>();
		
		do {
			System.out.println("1) create\n2) display\n3)exit");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			
			
			switch(choose){
				
			case 1:
				try 
				{
					System.out.print("Name "+" email "+"id\n");
					String name = sc.next();
					String email = sc.next();
					Integer id = sc.nextInt();
					
					
					lst.add(new employee(name, id, email));
					
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.txt"));
					oos.writeObject(lst);
					oos.flush();
					oos.close();
					
				}
				catch(Exception e) 
				{
					
				}
			
			case 2:
				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.txt"));
				List<employee> list = (List<employee>) (ois.readObject());
				Iterator<employee> itr = list.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
						
			case 3:
				break;
				
			}
		}
	while(true);
		
	}


}