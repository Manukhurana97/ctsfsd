package col;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class employee implements Serializable{
	private String name;
	private Integer id;
	private String email;
	
	public employee(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	
	
}