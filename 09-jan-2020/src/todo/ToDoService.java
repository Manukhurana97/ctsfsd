package todo;

import java.util.List;

public interface ToDoService {

	public ToDo createToDo(String toDoName);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoId);

}
