package jdbcobject;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class employee implements Serializable {
	
	private static final long serialVersionUID = -8841758879078031804L;
	
	private int employeeId;
	private String firstname;
	private String lastname;
	private double salary;
	

}
