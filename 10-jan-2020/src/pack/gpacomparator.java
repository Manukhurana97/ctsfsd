package pack;

import java.util.Comparator;

public class gpacomparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getGrade()>o2.getGrade()) {
			return -1;
		}
		else if (o1.getGrade()<o2.getGrade()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	

}
