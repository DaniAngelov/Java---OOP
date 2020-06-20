//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int counter = 0;
		for(int i = 1;i <= a;i++)
		{
			if(a % i == 0)
			{
				counter++;
			}
		}
		if(counter > 2)
		{
			System.out.println("Not a simple number");
		}
		else
			System.out.println("simple num");
	}
}
