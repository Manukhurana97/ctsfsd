package todo;

import java.util.List;

public interface ToDoService {

	public ToDo createToDo(String toDoName);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();
	public void updatebyid(String toDoId, String data);

}
