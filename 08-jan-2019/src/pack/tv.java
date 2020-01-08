package pack;

public class tv implements electronics {
	
	public String yearPublished;
	public double regularprice;
	public String Manufacture;
	
	

	

	public tv(String yearPublished, double regularprice, String manufacture) {
		super();
		this.yearPublished = yearPublished;
		this.regularprice = regularprice;
		Manufacture = manufacture;
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

//	no using set methord
	@Override
	public void setregularprice(double regularprice) {
		// TODO Auto-generated method stub
		this.regularprice = regularprice;
		
	}

	


	@Override
	public String getManufacture() {
		// TODO Auto-generated method stub
		return Manufacture;
	}
//	no using set methord
	@Override
	public void setManufacture(String name) {
		Manufacture = name;
		
	}

	@Override
	public String toString() {
		return "tv [yearPublished=" + yearPublished + ", regularprice=" + regularprice + ", Manufacture=" + Manufacture
				+ "]";
	}


	
	

	
	

}
