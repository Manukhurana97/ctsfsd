package pack;

public abstract class car {
	private double carprice;
	private String carcolor;
	private String carmodel;
	
	
	
	
	
	public double getCarprice() {
		return carprice;
	}


	public void setCarprice(double carprice) {
		this.carprice = carprice;
	}


	public String getCarcolor() {
		return carcolor;
	}


	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}


	public String getCarmodel() {
		return carmodel;
	}


	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}


	abstract int calculatedistance(int initdist, int finaldist);
	
	abstract int calculatefuel(int initduel, int finalfuel);
	
	
	@Override
	public String toString() {
		return "car [carprice=" + carprice + ", carcolor=" + carcolor + ", carmodel=" + carmodel + "]";
	}


	


	

}
