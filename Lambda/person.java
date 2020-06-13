public class person {

	private String firstname;
	private String lastname;
	private int age;


	public  person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname=lastname;
		this.age = age;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage()
	{
		return age;
	}


	@Override
	public String toString() {
		return "Person [firstname="+ firstname + ", lastname ="+lastname+", age ="+ age+"]";
	}
}