package thread;

public class threadtask extends Thread  {
	
	public void run(){ 
		for(int i=0;i<5;i++) {
			
			System.out.println("Id:  "+Thread.currentThread().getId()+"  Name: "+Thread.currentThread().getName()+"  Priority: "+ Thread.currentThread().getPriority()+"  State: "+Thread.currentThread().getState()+" group: "+Thread.currentThread().getThreadGroup());
				
			try {
				Thread.sleep(100);
			} 
			catch (InterruptedException e) {}
			
			
			
		}
	}
	public static void main(String[] args) {
		
//		with implements Runnable 
//		Thread th = new Thread(new threadtask(), "Thread 1");
//		Thread th1 = new Thread( new threadtask(), "thread 2");
		
		
//		with extends Thread (override)
		
		
		
//		threadtask th = new threadtask();
//		threadtask th1 = new threadtask();
//		th1.setPriority(1);
//		th1.setPriority(10);
//		
//		th.start();
//		th1.start();
//		System.out.println(th);
		
		ThreadGroup thg = Thread.currentThread().getThreadGroup(); //thread group
		System.out.println(thg.activeCount());
		
		new threadtask().start();
		new threadtask().start();
		new threadtask().start();
		new threadtask().start();
		
		
		
		
	}

}
