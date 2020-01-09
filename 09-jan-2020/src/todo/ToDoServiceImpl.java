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

	@Override
	public void deleteToDo(String toDoId) {
		dao.deleteToDo(toDoId);
		
	}

	@Override
	public void removeAllToDo() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void updatebyid(String toDoId, String data) {
		
		// TODO Auto-generated method stub
		 dao.updatebyid(toDoId, data);
	}

	
	

}
