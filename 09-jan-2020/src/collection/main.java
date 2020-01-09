package collection;

import java.util.Set;

public class main {

	private static customerdao cd;
	
	 static{
		cd = new customerdao();
	}
	public static void main(String[] args)
	{
		cd.createuser(1, "abc", "abc@gmail.com");
		cd.createuser(12, "abc", "abc@gmail.com");
		
		Set<customer> s = cd.getallcustomers();
		System.out.println(s);

	}

	
}
