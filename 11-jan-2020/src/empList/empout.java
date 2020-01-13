package empList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class empout {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		int id = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("no of employee: ");
		int noofemp = Integer.parseInt(br.readLine());
		List<employee> emplist = new ArrayList<employee>();
		for(int i=0;i<noofemp;i++) {
			id+=1;
			System.out.println("enter employee name: ");
			String st = br.readLine();
			System.out.println("enter employee department: ");
			String st1 = br.readLine();
			Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			System.out.println("age ");
			int st2 = br.read();
			System.out.println("salary ");
			int st3 = br.read();
			
			employee ee= new employee(id, st, st1, dateOfJoining,st2, st3 );
			
		}
		

	}

}
