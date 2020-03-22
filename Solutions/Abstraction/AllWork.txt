
public class AllWork 
{
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	private boolean check = false;
	private boolean isReady = false;
	
	AllWork()
	{	
		this.freePlacesForTasks = 10;
		this.tasks = new Task[10];
		this.currentUnassignedTask = 0;
		
	}
	
	void addTask(Task t)
	{
		if(this.freePlacesForTasks != 0)
		this.tasks[this.tasks.length - this.freePlacesForTasks--] = t;
		else
			System.out.println("There are no more places for tasks");
		
			
	}
	
	boolean getCheck()
	{
		return this.check;
	}
	
	Task getNextTask()
	{
		
		if(this.tasks[this.currentUnassignedTask] != null)
		{
			this.check = false;
			Task currTask = this.tasks[this.currentUnassignedTask++];
			return currTask;
		}
		else
		{
			System.out.println("There is no next task");
			this.isReady = true;
		}
		this.check = true;
		return null;
	}
	
	boolean isAllWorkDone()
	{
		for(int i = 0;i < tasks.length;i++)
		{
			if(tasks[i] != null)
			{
				if(tasks[i].getWorkingHours() != 0)
					return false;
			}
		}
		
		return true;
	}
}
