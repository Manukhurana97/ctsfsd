package pack;

public class myexception extends Exception {
	private String mgs;
	
	myexception(String mgs){
		super(mgs);
		this.mgs = mgs;
		
	}

	@Override
	public String toString() {
		return "myexception [mgs=" + mgs + "]";
	}
	

}
