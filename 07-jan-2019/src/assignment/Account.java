package assignment;

public class Account {
	int id;
	String Name;
	String address;
	
	
	public Account(int id, String name, String address) {
		super();
		this.id = id;
		Name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + "\n, Name=" + Name + "\n, address=" + address + "]";
	}


	
	@Override
	public boolean equals(Object obj) {
		
		
		Account acc = null;
		Boolean result = false;
		
		Boolean result1 = false;
		if(obj instanceof Account) {
			acc = (Account)obj;
		}
		
		if(this.id == acc.id) 
		{
			result = true;
			
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public String checkAccountType()
	{
	 	String type = null;
	 	
	 	if(this instanceof current)
	 	{
	 		type = "Current Account";
	 	}
	 	else
	 	{
	 		type = "Savings Account";
	 	}
	 	return type;
	}
	

}

