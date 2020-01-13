package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException, passwordexception {
		boolean valid;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the password: ");
		String str =  br.readLine();
		UserMainCode uc = new UserMainCode();
		valid = uc.checkPassword(str);
		if(valid) {
			System.out.println("valid password\n Successfully login");
		}
		else {
			System.out.println("incorrect password");
		}
		
		

	}

}
