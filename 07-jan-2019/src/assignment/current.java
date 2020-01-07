package assignment;

public class current extends Account {
	
	boolean iseligible;
	int amount;
	
	
	public current(int id, String name, String address, int amount) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
		this.amount = amount;
		
		
		if(amount>50000) {
			iseligible = true;
		
		}
	
		
	}

	
	@Override
	public String toString() {
		
		return super.toString()+"\ncurrent [iseligible=" + iseligible + "\n, amount=" + amount + "]";
	}
	
	
	
	
	

}


// tostring
