import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;


public class dynamicmethod {


	public static void main(String[] args) {

		// Adding data to list
		List<person> list = Arrays.asList( 
			new person ("Manu", "khurana", 22),
			new person ("anu", "hurana", 30),
			new person ("abc", "ana", 15)
			);

// 		Sorting data based on last value
		Collections.sort(list, new Comparator<person>() {
			public int compare(person p1, person p2) {
				return p1.getLastname().compareTo(p2.getLastname()); 
			}
		});

// 		print all the data from list
		printAll(list);


// 		print all start last name with k
		printAllWithLastNameStartWith(list, new Condition(){

			@Override
			 public boolean test(person p)
			 {
			 	return p.getLastname().startsWith("k");
			 }
		});
	}


	//  implementation of print all
	public static void printAll(List<person> list) {
		for(person p: list) {
			System.out.println(p);
		}
	}

	//  implementation of prinal all last name astart with ""
	public static void printAllWithLastNameStartWith(List<person> list, Condition condition) {
		for (person p: list) {
			if(condition.test(p)) {
				System.out.println("Start with c:  "+p);
			}
		}
	}
	
}

interface Condition {
	boolean test(person p);
}
