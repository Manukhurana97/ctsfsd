package empList;

import java.util.Comparator;

public class AgeComparator implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		employee e1 = (employee)o1;
		employee e2 = (employee)o1;
			
		if(e1.getAge() == e2.getAge())
		{
			return e1.getDateOfJoining().compareTo(e1.getDateOfJoining());
		}
		else if(e1.getAge() > e2.getAge())
		{
			return -1;
		}
		else {
			return 1;
		}
	}
	

}
