import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;


public class Exercise1 {


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
		printAllWithLastNameStartWithk(list);
	}


	public static void printAll(List<person> list) {
		for(person p: list) {
			System.out.println(p);
		}
	}

	public static void printAllWithLastNameStartWithk(List<person> list)
	{
		for (person p: list) {
			if (p.getLastname().startsWith("k"))  {
				System.out.println("Start with c:  "+p);
			}
		}
	}
	
}
