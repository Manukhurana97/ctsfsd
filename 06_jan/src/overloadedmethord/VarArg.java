package overloadedmethord;

public class VarArg {
	
	private String str;


	
	public int add(int... a) 
	{
		int abcd = 0;
		System.out.println(a);
		
		for(int i: a) 
		
		{ abcd+=i;}
		
		return abcd;
		
	}
	
	
	public String add(int a, String b) 
	{
		
		return str+(a+b);
	}

	
	
}
