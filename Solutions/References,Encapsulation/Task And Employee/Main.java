// github.com/DaniAngelov

public class Main {

	public static void main(String[] args) 
	{
		Employee e = new Employee("Ivan");
		Employee e2 = new Employee("Boris");
		Task t = new Task("Building",20);
		e.setTask(t);
		e2.setTask(t);
		e.setHoursLeft(4);
		e2.setHoursLeft(5);
		
		e.showReport();
		e2.showReport();
		
		
	}

}
