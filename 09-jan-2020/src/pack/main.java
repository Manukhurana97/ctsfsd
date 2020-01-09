package pack;

public class main {
	public static int count=0;

	public static void main(String[] args) {
		while(true) {
			try {
				if(count++==0) {
					throw new myexception("greater then zero");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally {
				System.out.print("finally executed");
				if(count==2) {
					break;
				}
			}
		}
		
	}

}
