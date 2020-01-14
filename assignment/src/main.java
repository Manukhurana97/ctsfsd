import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import assessment2.country;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no: ");
		int no = br.read();
		country c = new country();
		

		
		for(int i=0;i<no;i++) {
			String[] countryname = country.split("|");
			System.out.println("enter state name: ");
			String str = br.readLine();
			
			
		}
		
		
	}

}
