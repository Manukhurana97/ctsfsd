package chaning;

public class Person11 {
	
	public Person11() 
	{
		this("abc");
		System.out.println("first");
	}
	
	public Person11(String name) 
	{
		this("abc", 10);
		System.out.println("second");
	}
	
	public Person11(String name, int age)
	{
		display(name, age);
		System.out.println("third");
		
	}
	
	public void display(String name, int age) 
	{
		System.out.println(name+age);
	}
	public static void main(String[] args)
	{
		Person11 p = new Person11();
	}
	
	
	

}
