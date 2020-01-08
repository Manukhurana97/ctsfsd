package methordoverrinding;

import java.util.UUID;

public class tester {
	public static void main(String[] args) throws HireExperienceException {
		
		employee e = new employee(100, "manu", "faridabad", 5);
		employee e1 = new employee(1001, "manu", "faridabad", 5);
		if(e.equals(e1)) {
			System.out.println("Account already present");
		}
		else {
			e.createemployee();
			System.out.println(e);
			System.out.println(e1);
		}
	}

}
