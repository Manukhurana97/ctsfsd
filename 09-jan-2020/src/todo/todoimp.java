package todo;

import java.util.*;
import java.util.List;

public class todoimp implements tododao	{

	
	private List<ToDo> todolist = null;
	
	private ToDo td;
	{
		todolist=new ArrayList<ToDo>();
	}
	
	
	 
	
	@Override
	public ToDo createtodo(String todoname) {
		td=new ToDo(UUID.randomUUID().toString(), todoname);
		todolist.add(td);
		return td;
	}

	@Override
	public ToDo findById(String todoid) {
		Iterator<ToDo> iterator=todolist.iterator();
		
		while(iterator.hasNext())
		{
			td=iterator.next();
			if(td.getTodoid()==todoid)
			{
				
				System.out.println(td.getTodoid());
				break;
			}
		}
		return td;
	}

	public List<ToDo> getalltodo() {
		// TODO Auto-generated method stub
		return todolist;
	}

	@Override
	public void deleteToDo(String next) {
		if(todolist.isEmpty())
		{
			System.out.println("todo list is empty.");
			
		}	
		td=findById(next);
		if(td==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			todolist.remove(td);
			System.out.println("remoded sucessfully with id: "+todolist);
		}
		
	}



	@Override
	public void removeAllToDo(String todoid) {
		todolist.removeAll(todolist);
		
	}

	@Override
	public void updatebyid(String toDoId, String data) {
		ToDo abc = findById(toDoId);
		int index = todolist.indexOf(findById(toDoId));
		abc.setTodoname(data);
		 todolist.set(index, abc);
		
		
	}

	
	
}
