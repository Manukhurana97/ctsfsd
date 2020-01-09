package todo;

import java.util.List;

public interface tododao {
	public ToDo createtodo(String todoname);
	public ToDo findById(String todoid);
	
	List<ToDo> getalltodo();
}
