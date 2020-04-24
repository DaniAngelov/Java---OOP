// github.com/DaniAngelov

public class Employee 
{
	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	Employee()
	{
		this.name = "";
		this.hoursLeft = 0;
		this.currentTask = null;
	}
	Employee(String name)
	{
		this.name = name;
	}
	
	public void setTask(Task task)
	{
		this.currentTask = task;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		if(name != "" && name != null)
		this.name = name;
	}
	
	public int getHoursLeft() 
	{
		return hoursLeft;
	}
	public void setHoursLeft(int hoursLeft) 
	{
		if(hoursLeft > 0)
		this.hoursLeft = hoursLeft;
	}
	
	void work()
	{
		
		if(this.currentTask.getWorkingHours() > this.getHoursLeft())
		{
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
			this.setHoursLeft(0);
		}
		else
		{
			this.currentTask.setWorkingHours(0);
			this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
		}
	}
	
	void showReport()
	{
		work();
		
		System.out.println("Employee Name: " + this.getName());
		System.out.println("Task Name: " + this.currentTask.getName());
		System.out.println("Employee Left Hours: " + this.getHoursLeft());
		System.out.println("Hours left of the Task: " + this.currentTask.getWorkingHours());
		System.out.println("--------------------------------------------");
	}
	
	
	
	
}
