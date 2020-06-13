import java.util.*;


public class ForEachlambda {
	public static void main(String[] args) {
		List<person> list = Arrays.asList( 
			new person("abc", "xyz", 10),
			new person("abcd", "xyzA", 20));
	

	for(person p : list)
	{
		System.out.println(p);
	}
	System.out.println();

	// Lambda for each
	list.forEach(p -> System.out.println(p));

	list.forEach(System.out::println);
	}
}