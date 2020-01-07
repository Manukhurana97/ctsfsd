package pack;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount: ");
		int am = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String st = sc.next();
		
		Account acc = Account.createAccount(Accounttype.CREDIT_CARD, am,st );
		acc.display_info();

	}

}
