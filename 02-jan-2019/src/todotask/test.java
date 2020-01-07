package todotask;

import java.util.Scanner;

public class test {
	
	final static int maxlen = 10;
	
	public static void main(String[] args) {
		
		
		
		fortuneclass fc = new fortuneclass();
		fc.display();
		
		String iscomp;
		Scanner sc = new Scanner(System.in);
		
		task tk[] = new task[maxlen];
		
		System.out.println("Enter the no of task u want to create: ");
		int tskno = sc.nextInt();
		
		for(int i=0;i<tskno;i++) 
		{
			System.out.println("Name: ");
			String st = sc.nextLine();
			
			System.out.println("Task Name: ");
			String st1 = sc.nextLine();
			
			System.out.println("Is completed (Y/N): ");
			String st2 = sc.nextLine();
			
			if(st2.equals("Y") || st2.equals("y") )
			{
				 iscomp = "Completed";
			}
			else
			{
				 iscomp = "Not Completed";
			}

			
			todo td =  todo.createtask(st, st1,st2);
			td.printdata();
			
			
		}
		
		
		
		
		
		
	}

}
