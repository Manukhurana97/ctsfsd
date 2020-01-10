package pack;

import java.util.Comparator;

public class namecomparison implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (o1.getStudentName().compareTo(o2.getStudentName()));
	}

}
