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

	@Override
	public List<ToDo> getalltodo() {
		// TODO Auto-generated method stub
		return todolist;
	}

	
}
