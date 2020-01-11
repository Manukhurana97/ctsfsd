package thread;

public class producer extends Thread {
	public mystack mystk;
	public int number;
	
	public producer(mystack mystk, int number) {
		super();
		this.mystk = mystk;
		this.number = number;
	}
	
	public void run()
	{
		mystk.push(number);
		
		try {
			sleep((int)(Math.random() * 100));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

}
