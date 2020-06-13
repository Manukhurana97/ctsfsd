public class Hellogreeting {

	public static void main(String[] args) {

		method1((s) -> { return s.length();});

		
		
	}

	public static void method1(calculateLength cl)
	{
		System.out.println(cl.count("Manukhurana"));
	}


	interface calculateLength {

		int count(String s);
	}
}