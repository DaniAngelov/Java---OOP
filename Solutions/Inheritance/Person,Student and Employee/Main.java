// github.com/DaniAngelov

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
	
		for(int i = 0;i < 10;i++)
		{
			System.out.println("Enter person,employee or student :");
			
			
			String command = sc.nextLine();
			if(i > 0)
				command = sc.nextLine();
			System.out.println("Enter name, age and gender(false if female)");
			String name = sc.nextLine();
			int age = sc.nextInt();
			boolean isMale = sc.nextBoolean();
			if(command.equals("person"))
			{
				Person p = new Person(name,age,isMale);
				p.showPersonInfo();
			}
			else if(command.equals("student"))
			{
				System.out.println("Enter Student Score : ");
				double score = sc.nextDouble();
				Student s = new Student(name,age,isMale,score);
				s.showStudentInfo();
			}
			else if(command.equals("employee"))
			{
				System.out.println("Enter Salary: ");
				double salary = sc.nextDouble();
				Employee e = new Employee(name,age,isMale,salary);
				double overtime = e.calculateOvertime(2);
				System.out.println("Money that this employee should get because of the overtime: " + overtime);
				e.showEmployeeInfo();
			}
			
		}
		
	}
	
}
