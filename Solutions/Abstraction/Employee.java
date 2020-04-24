// github.com/DaniAngelov

package domashno14_zadacha1;

import sun.tools.tree.ThisExpression;

public class Employee 
{
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork ;
	private boolean isReady = false;
	
	
	Employee(String name)
	{
		
		this.hoursLeft = 8;
		if(name != null && name != "")
		this.name = name;
		
	}
	
	public void setCurrentTask(Task task)
	{
		this.currentTask = task;
	}
	public Task getCurrentTask()
	{
		return this.currentTask;
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
		if(hoursLeft >= 0)
		this.hoursLeft = hoursLeft;
	}
	
	
	
	public AllWork getAllwork()
	{
		return this.allwork;
	}

	public void setAllwork(AllWork allwork)
	{
		this.allwork = allwork;
	}
	
	void startWorkingDay()
	{
		this.hoursLeft = 8;
	}

	void work()
	{
		
		if(this.currentTask.getWorkingHours() > this.getHoursLeft())
		{
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
			this.setHoursLeft(0);
			System.out.println("Working on current task!!");
		}
		else
		{
			
			this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
			System.out.println("This task is done ! Good job !");
			if(!this.getAllwork().getCheck())
			{
			this.setCurrentTask(this.getAllwork().getNextTask());
			
			if(this.getCurrentTask() != null)
			{
			System.out.println("New task assigned !");
			}
			else
			{
				System.out.println("There is no more work, Chill !");
			}
			}
					
			
			
			
			if(this.getAllwork().getCheck())
				return;
			
			if(this.getHoursLeft() != 0 && !this.isReady)
				work();
		}
		
		
		
		
	}
	
	void showReport()
	{
		if(this.getCurrentTask() != null)
		{
		work();
		
		if(this.getCurrentTask() != null)
		{
		System.out.println("Employee Name: " + this.getName());
		System.out.println("Task Name: " + this.currentTask.getName());
		System.out.println("Employee Left Hours: " + this.getHoursLeft());
		System.out.println("Hours left of the Task " + this.currentTask.getName() + ": " + this.currentTask.getWorkingHours());
		System.out.println("--------------------------------------------");
		}
		}
	}
	
	
	
	
}
