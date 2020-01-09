package todo;

import java.util.List;

public interface tododao {
	public ToDo createtodo(String todoname);
	public void deleteToDo(String next);
	public ToDo findById(String toDoId);
	public void removeAllToDo(String todoid);
	public void updatebyid(String toDoId, String data);
	public List<ToDo> getalltodo();
	
}
	
