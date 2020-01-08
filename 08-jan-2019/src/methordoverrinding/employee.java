package methordoverrinding;

public class employee {
	int emp_id;
	String emp_name;
	String emp_address;
	private int experience;
	boolean result;
	
	
	
	public employee(int emp_id, String emp_name, String emp_address, int experience) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.experience = experience;
	}



	public void createemployee() throws HireExperienceException {
		String result  = null;
		
		if(experience<2) {
			throw new HireExperienceException(" experience is less ");
		}
		else {
			System.out.println("eligible for job");
		}
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emp_address == null) ? 0 : emp_address.hashCode());
		result = prime * result + emp_id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		employee e = null;
		
		if(obj instanceof employee) {
			e = (employee) obj;
		}
		
		if(this.emp_id == e.emp_id && this.emp_address.equals(e.emp_address))
		{
			result = true;
			try 
			{
				throw new employeecantbecreate("duplicated element");
			
			}
			catch(Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else {
			
			System.out.println("account created");
		}
		
		return result;
				
	}



	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address
				+ ", experience=" + experience + ", result=" + result + "]";
	}
	
	
	
	
}
