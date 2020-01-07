package assignment;

public class Saving extends Account {
	
	float rate_of_interest = (float) 4.5;
	int amount;
	
	
	public Saving(int id, String name, String address, int amount) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
		
		this.amount = amount;
		
	}
	

	
	@Override
	public String toString() {
		return super.toString()+"\nSaving [rate_of_interest=" + rate_of_interest + "\n, amount=" + amount + "]";
	}


}

