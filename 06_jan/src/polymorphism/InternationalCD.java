package polymorphism;

public class InternationalCD extends CD {
	private String language;
	
	public InternationalCD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InternationalCD(int cd_id, String cdName, String genre, double price,String language) {
		super(cd_id, cdName, genre, price);
		this.language=language;
	}
	
	
	@Override
	public String toString() {
		return "InternationalCD==>\n  CD Details=" + super.toString() + "language=" + language;
	}
}
