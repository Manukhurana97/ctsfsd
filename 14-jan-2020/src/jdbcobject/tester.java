package jdbcobject;

import java.util.List;

public class tester {
	private empservise emps;

	public static void main(String[] args) throws Exception {
			
		
		{
			tester tr = new tester();
			tr.emps = new empserimp() ;
			
			List<employee> lst = tr.emps.getAllemployees();
		} 
	}

}
