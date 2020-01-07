package pack;



public class Task {
	
	
	
	public Task() {
		super();
	}


	public Task(String task_id, String task_Name, String created_by, Boolean is_completed) {
		super();
		this.task_id = task_id;
		Task_Name = task_Name;
		Created_by = created_by;
		Is_completed = is_completed;
	}
	
	
	
private String task_id;
	
	public String getTask_id() {
		return task_id;
	}


	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}


	public String getTask_Name() {
		return Task_Name;
	}


	public void setTask_Name(String task_Name) {
		Task_Name = task_Name;
	}


	public String getCreated_by() {
		return Created_by;
	}


	public void setCreated_by(String created_by) {
		Created_by = created_by;
	}


	public Boolean getIs_completed() {
		return Is_completed;
	}


	public void setIs_completed(Boolean is_completed) {
		Is_completed = is_completed;
	}


	private String Task_Name;
	private String Created_by;
	private Boolean Is_completed;
	
	


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj)
		// TODO Auto-generated method stub
		//		return super.equals(obj)
	
	 {  // main-> sysout(ob1 = ob2) 
		// Object  obj = ob2
		//	ob1 = task class
				
		
		Task tsk = null;
		boolean isEqual=false;

			if(obj instanceof Task)
			{
				 tsk = (Task) obj;
//				  changing the obj class to task(Type cast)
				
			}
		

			if((this.getTask_Name() == tsk.getTask_Name()) && this.getCreated_by()==tsk.getCreated_by())
			{
				isEqual = true;
			}
		return isEqual;
		
	}


	@Override
	public String toString() {
		return "Task [task_id=" + task_id + ", Task_Name=" + Task_Name + ", Created_by=" + Created_by
				+ ", Is_completed=" + Is_completed + "]";
	}
	
	
	
	
	
	
}
