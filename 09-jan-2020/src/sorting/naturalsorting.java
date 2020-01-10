package sorting;

import java.util.*;

public class naturalsorting {
	
	
	List<String> name;
	{
		name = new LinkedList<>();
		name.add("b");
		name.add("c");
		name.add("a");
		name.add("b");
		name.add("c");
		
	}
	public static void main(String[] args) {
		naturalsorting ns = new naturalsorting();
		Collections.sort(ns.name);
		System.out.println(ns.name);
		
	}

}
