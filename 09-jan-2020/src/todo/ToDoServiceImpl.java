package todo;

import java.util.List;

public class ToDoServiceImpl implements  ToDoService{
	
	public tododao dao = null;
	{
		dao = new todoimp();
	}
	

	@Override
	public ToDo createToDo(String toDoName) {
		// TODO Auto-generated method stub
		return  dao.createtodo(toDoName);
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return  dao.getalltodo();
	}

	@Override
	public ToDo findById(String toDoId) {
		// TODO Auto-generated method stub
		return dao.findById(toDoId);
	}

}
