package pack;

import java.util.*;

public class ComparatorTest {

	public static void main(String[] args) {
		Comparator c=  new namecomparison();
		c = new namecomparison();
		Set<Student> SS = new TreeSet<Student>(c);
		SS.add(new Student("manu", 100, 9));
		SS.add(new Student("saif", 101, 10));
		SS.add(new Student("arun", 102, 5));
		SS.add(new Student("moti", 103, 4));
		
		Iterator<Student> itr = SS.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
