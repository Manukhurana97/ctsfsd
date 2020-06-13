import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class moreLambda {


	public static void main(String[] args) {

		// Adding data to list
		List<person> list = Arrays.asList( 
			new person ("Manu", "khurana", 22),
			new person ("anu", "hurana", 30),
			new person ("abc", "ana", 15)
			);

// 		Sorting data based on last value
		Collections.sort(list, (person p1, person p2) -> {return p1.getLastname().compareTo(p2.getLastname()); }
		);

// 		print all the data from list
		// printAll(list);
		performconditionally(list, p -> true, p -> System.out.println("Start with M:  "+p)); 


// 		print all start last name with k
		performconditionally(list , (person p) -> { return p.getFirstname().startsWith("M");}
		,p -> System.out.println("Start with M:  "+p));
	}

	//  Predicate is predifined method in java
	public static void performconditionally(List<person> list, Predicate<person> condition, Consumer<person> consumer) {
		for (person p: list) {
			if(condition.test(p)) {
				consumer.accept(p);
			}
		}
	}
	
}

