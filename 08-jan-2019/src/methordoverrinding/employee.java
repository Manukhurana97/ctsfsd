package methordoverrinding;

public class employee {
	int emp_id;
	String emp_name;
	String emp_address;
	private int experience;
	
	
	
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
	
	
	
}
