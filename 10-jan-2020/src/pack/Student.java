package pack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString



public class Student implements Comparable<Student> {
	
	private String StudentName;
	private int id;
	private double grade;
	
	
	
	
	
	
		@Override
	public int compareTo(Student o) {
		int result = 0;
		
		if(this.getId()>o.getId()) {
			result = 1;
			
		}
		
		if(this.getId()>o.getId()) {
			result= -1;
		}
		
		if(this.getGrade()>o.getGrade()) {
			result= 0;
		}
		
		
		return result;
	}






		






		

}
