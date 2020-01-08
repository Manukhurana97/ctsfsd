package password;

public class chechpassword {
	String password;
	boolean result;
	char passch;

	public chechpassword(String password) {
		super();
		this.password = password;
		
	}

	public boolean checkpassword(String pass) throws invalidpassword
	{
		if(password.length()>=8 && password.length()<=15) 
		{
			
				for(int i=0;i<pass.length();i++)
				{
					passch = pass.charAt(i);
					System.out.println(passch);
					if(!password.matches("^[a-zA-Z0-9]+")) {
						throw new invalidpassword("password invalid");
						
					}
					else {
						result = true;
					}
				}	
			
		}
		else {
			throw new invalidpassword("Error length of the password cannot match");
		}
		if(result) {
		System.out.println("Successfully login");
		}
		
		return result;
	}

	
	

	@Override
	public String toString() {
		return "chechpassword [password=" + password + "]";
	}
	
	
	

}
