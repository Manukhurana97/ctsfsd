package pack;

import java.util.*;

public class main {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("manu", 100, 9));
		set.add(new Student("saif", 101, 10));
		set.add(new Student("arun", 102, 5));
		set.add(new Student("moti", 103, 4));
		
		
		
		Iterator<Student> obj = set.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
	}

}
