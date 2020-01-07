package pack;

import java.util.UUID;

public class test {

	public static void main(String[] args) {
		Task tk1 =  new Task(UUID.randomUUID().toString(), "abc", "Manu", true);
		Task tk2 =  new Task(UUID.randomUUID().toString(), "abc", "Manu", true);
		
		System.out.println(tk1 == tk2);
		System.out.println(tk1.equals(tk2) );
	}

}
