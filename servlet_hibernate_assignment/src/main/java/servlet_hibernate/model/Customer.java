package servlet_hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity

public class Customer {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "uid")
	private String uid;
	
	
	public Customer(String firstname, String lastname, String email, String uid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.uid = uid;
	}
	
	
	


}
