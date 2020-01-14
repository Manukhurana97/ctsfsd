package jdbcobject;

import java.sql.SQLException;
import java.util.List;

public interface employeedao {
	
	List<employee> getAllemployees() throws SQLException;

}
