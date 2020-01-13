package assignment;

public class passwordexception extends Exception {
	
	String mgs;

	public passwordexception(String mgs) {
		super();
		this.mgs = mgs;
	}

	@Override
	public String toString() {
		return "passwordexception [mgs=" + mgs + "]";
	}
	
	

}
