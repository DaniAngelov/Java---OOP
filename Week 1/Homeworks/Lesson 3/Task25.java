//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mult = 1;
		int counter = 1;
		do
		{
			mult *= counter;
			counter++;
			
		}while(counter < n + 1);
		
		System.out.println(mult);
	}
	
	
}
