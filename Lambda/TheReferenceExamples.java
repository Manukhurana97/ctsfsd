public class TheReferenceExamples {

	public void doProcess(int i, Process p)
	{
		p.process(i);
	}

	public void perform(){
		doProcess(10, i -> {
			System.out.println("Value of i"+ i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		TheReferenceExamples the = new TheReferenceExamples();

		// anonimous inner class
		// the.doProcess(10, new Process() {
			
		// 	@Override
		// 	public void process(int i)
		// 	{
		// 		System.out.println("value "+i);
		// 		System.out.println(this); // refrencing to to String 
				
		// 	}

		// 	@Override	
		// 	public String toString(){
		// 		return "anonymous inner class";
		// 	}

		// });


		the.perform();

	}

	public String toString(){
		return "Lambda function";
	}

}