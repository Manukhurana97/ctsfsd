package servlet_hibernate.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Customerdto {
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String uid;

}
