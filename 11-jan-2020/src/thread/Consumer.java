package thread;

public class Consumer extends Thread{
	
	private mystack mystk;
	
	
	public Consumer(mystack mystk) {
		super();
		this.mystk = mystk;
		
	}
	
	public void  run() {
		int value = 0;
		for(int i=0;i<1;i++) {
			value = mystk.pop();
			
		}
	}
	

}
