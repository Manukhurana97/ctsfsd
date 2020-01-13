package empList;

import java.time.LocalDate;
import java.util.Date;

public class employee {
	
	public static final Class<e2> getage = null;
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public employee(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	int age;
	int salary;

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}

	
	public int compareto(employee o1) {
		if(salary==o1.salary) {
			return 0;
		}
		else if(salary>o1.salary) {
			return -1;
		}
		return 0;
	}
	

}
