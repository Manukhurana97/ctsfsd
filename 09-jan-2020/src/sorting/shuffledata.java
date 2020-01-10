package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class shuffledata {

	public static void main(String[] args) {
		String name[] = { new String("a"),new String("b"),new String("c"),};
		
		List<Integer> i = new LinkedList<Integer>();
		i.add(2);
		i.add(3);
		i.add(1);
		i.add(2);
		i.add(3);
		
		System.out.println(Collections.binarySearch(i, 2));
		System.out.println(i);
		System.out.println(i.get(3));
		 

	}

}
