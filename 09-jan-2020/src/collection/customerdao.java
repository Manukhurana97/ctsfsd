package collection;

import java.util.*;


public class customerdao {
	
	private Set<customer> cset=  null;
	
	{
		cset = new HashSet<customer>();
	}
	
	
	public void createuser(int Custid,String Name, String email ) 
	{
		cset.add(new customer(Custid, Name, email));
		
	}
	
	
	public Set<customer> getallcustomers(){
		return cset;
	}
 
}
