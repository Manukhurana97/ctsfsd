package thread;

public class mystack {
	public int num;
	
	static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    boolean isEmpty() {
    	return (top<0);
    }
    mystack(){
    	top=-1;
    }
    
    public synchronized boolean push(int data)
    {
    	if(top>=MAX-1)
    	{
	    	System.out.println("Stack overflow");
	    	return false;
    	}
    	else {
    		
	    	a[++top]=data;
	    	System.out.println(a[top]+ " added to list");
	    	return true;
    	}
    }
    
    public synchronized int pop()
    {
    	if(isEmpty())
    	{
	    	System.out.println("Stack is empty");
	    	return 0;
    	}
    	else {
    		System.out.println(a[top]+" successfully is remove");
	    	return a[top--];
    	}
    }
    
    public void display() {
    	if(top<=0) {
    		System.out.println("Stack is empty");
    	}
    	else {
	    	for(int i=0;i<top+1;i++) {
	    		System.out.println(a[i]);
	    	}
    	}
    }

}
