public class ClosuresExample {

	public static void main(String[] args) {

		int a=10 , b=20;
		
		doprocess(a, new Process(){

			@Override
			public void process(int i){
				System.out.println(i + b);
			}
		});

		// lambda
		doprocess(a, (int i) ->{System.out.println(i + b);});
	}

	public static void doprocess(int i, Process p)
	{
		p.process(i);
	}
}

interface Process{
	void process(int i);
}