package pack;

public class sedan extends car {

	
	@Override
	int calculatedistance(int initdist, int finaldist) {
		return finaldist - initdist;
		
	}
	
	@Override
	int calculatefuel(int initduel, int finalfuel) {
		return initduel-finalfuel;
	}
	
	
	public sedan(String carcolor, double carprice, String carmodel) {
		setCarcolor(carcolor);
		setCarmodel(carmodel);
		setCarprice(carprice);
		
		 
	}
	
	public static void main(String[] args) {
		car s = new sedan("red", 10000, "sports");
		System.out.println(s);
		int dist = s.calculatedistance(100, 200);
		int fl = s.calculatefuel(50, 30);
		System.out.println("dist: "+dist+"\nfuel: "+fl+"\nmilage: "+(dist/fl));
				

	}


}
