package pack;

public class Book implements productinterface  {
	
	public String Name;
	public String yearPublished;
	
	public double regularprice;

	public Book(String name, String yearPublished, double regularprice) {
		super();
		Name = name;
		this.yearPublished = yearPublished;
		this.regularprice = regularprice;
	}

	@Override
	public double computeprice() {
		// TODO Auto-generated method stub
		return regularprice*0.5;
	}

	@Override
	public double getregularprice() {
		// TODO Auto-generated method stub
		return regularprice;
	}

	@Override
	public void setregularprice(double regularprice) {
		// TODO Auto-generated method stub
		this.regularprice = regularprice;
		
	}
	

	@Override
	public String toString() {
		return "Book [Name=" + Name + ", yearPublished=" + yearPublished + ", regularprice=" + regularprice + "]";
	}
	
	
	

	
	




	

}
