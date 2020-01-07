package pack;

public enum suit {
	SUNDAY("sunday", 1),
	MONDAY("monday", 2),
	TUESDAY("tuesday", 3),
	WEDNUSDAY("wednusday",4),
	THURSDAY("thursday", 5),
	FRIDAY("friday", 6),
	SATURDAY("saturday", 7);
	
	
	private final String name;
	private final int rank;
	
	private suit(String n, int r) {
		name = n;
		rank = r;
	}
	
	 String getName1() {
		return name;
	}
	
	int getrank() {
		return rank;
	}

}
