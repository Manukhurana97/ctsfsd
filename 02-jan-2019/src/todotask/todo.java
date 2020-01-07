package todotask;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Setter
@Getter

public class todo {
	
	private String todo_id;
	private String date_of_creating;
	private LocalDate dateofOpening;
	private int no_of_times;
	private static int current_arr = 0;
	
	final static int maxlen = 10;

	String tkid[] = new String[maxlen];
	String tkTask_Name[] = new String[maxlen];
	String tCreate_byd[] = new String[maxlen];
	
	
	private static task Tk1;
	private static todo td;
	
	
	static {
		Tk1 = new task();
		td = new todo();
		
	}
	
	static todo createtask(String task_Name, String create_by, String isCompleted ) 
	{
		Tk1.setTaskid(UUID.randomUUID().toString());
		Tk1.setTask_Name(task_Name);
		Tk1.setCreate_by(create_by);
		td.setDateofOpening(LocalDate.now());
		Tk1.setIsCompleted(isCompleted);
		
		
		
		
		
		return td;
	}
	
	
	
	void printdata() 
	{
		System.out.println("current: "+current_arr);
		System.out.println("taskid :"+Tk1.getTaskid()+"\nTaskName: "+Tk1.getTask_Name()+"\n"+Tk1.getTaskid()+"\n"+Tk1.getIsCompleted()+"\n"+td.dateofOpening);
	}
	
	
}