//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	String names[] = new String[10];
	int salaries[] = new int[10];
	
	
	for(int i = 0 ;i <10;i++)
	{
		System.out.println("Enter a worker name: ");
		String str = sc.nextLine();
		names[i] = str;
		System.out.println("Enter a worker salary: ");
		salaries[i] = sc.nextInt();
		str = sc.nextLine();
	}
	
	int max = 0;
	int min = salaries[0];
	int sum = 0;
	double avg = 0;
	String workerMin = "";
	String workerMax = "";
	for(int i = 0;i < 10;i++)
	{
		if(salaries[i] > max)
		{
			max = salaries[i];
			workerMax = names[i];
		}
		if(salaries[i] < min)
		{
			min = salaries[i];
			workerMin = names[i];
		}
		sum += salaries[i];
	}
	
	System.out.println("Worker with Min salary : " + workerMin + " " + min + " leva" );
	System.out.println("Worker with Max salary : " + workerMax + " " + max + " leva" );
	System.out.println("Sum of all salaries : " + sum);
	System.out.println("Avarage of all salaries : " + sum / 10);
	}
	
}
