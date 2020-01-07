package todotask;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class fortuneclass {
	String arr[]  = new String[5];
	
	
	{
		arr[0] = "hello1";
		arr[1] = "hello2";
		arr[2] = "hello3";
		arr[3] = "hello4";
		arr[4] = "hello5";
	}
	
	public void display() 
	{
		int rnd = new Random().nextInt(arr.length);
		System.out.println(arr[rnd]);
	}
	
}
