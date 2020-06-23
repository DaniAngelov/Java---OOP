//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	String names[] = new String[10];
	
	System.out.println("In normal order");
	
	for(int i = 0 ;i < 10;i++)
	{
		System.out.println("Enter a worker name: ");
		names[i] = sc.nextLine();
	}
	
	for(int i = 0;i < 10;i++)
	{
		
		System.out.print(names[i] + " ");
	}
	
	System.out.println("In reversed order");
	for(int i = 9;i >= 0;i--)
	{
		
		System.out.print(names[i] + " ");
	}
	
	}
	
}
