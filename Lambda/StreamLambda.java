import java.util.*;

public class StreamLambda {

	public static void main(String[] args) {
		List<person> list = Arrays.asList(
			new person("manu" , "khrana", 123),
			new person("anu" , "khurana", 1234));
	
	list.stream()
	.filter(p -> p.getLastName().startsWith("k"))
	.forEach(p -> System.out.println(p));


	long count = list.parallelStream()
	.filter(p -> p.getLastName().startsWith("k"))
	.count();

	System.out.println(count);
	}
}