import java.util.function.*;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		
		int [] abc = {1,2,3,4, 0};
		int key = 2;


		operations(abc, key, (i, k) -> {
			try { System.out.println(i/k); } 
			catch(Exception e) { System.out.println(e);}});
	}


	public static void operations(int[] arr, int k, BiConsumer<Integer, Integer> perform)
	{
		for(int i: arr)
		{
			perform.accept(i, k);
		}
	}
}