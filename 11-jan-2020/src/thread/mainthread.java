package thread;
import java.lang.*;

public class mainthread {
	public static void main(String[] args) {
		
	
	mystack mystk = new mystack();
	
	for(int i=0;i<10;i++) {
		
		producer pd = new producer(mystk, i);
		Consumer cs = new Consumer(mystk);
		pd.start();
		cs.start();
		}
	
	
	}
	
}
