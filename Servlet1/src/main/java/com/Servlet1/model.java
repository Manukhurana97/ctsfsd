package com.Servlet1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class model {

	private String uid;
	private String Firstname;
	private String Lastname;
	
	public model(String uid, String firstname, String lastname) {
		super();
		this.uid = uid;
		Firstname = firstname;
		Lastname = lastname;
	}
	
	
	
	
}
