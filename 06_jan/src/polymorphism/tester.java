package polymorphism;

public class tester {

	public static void main(String[] args) {
		CD cd=new InternationalCD(1, "Harry Potter", "adventure", 20, "english");
		cd.getCDType(cd);
		System.out.println(cd);

	}

}
