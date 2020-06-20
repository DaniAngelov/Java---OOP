//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int counter = n - 1;
		
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0 ;j < n;j++)
			{
				System.out.print(counter);
			}
			System.out.println();
			counter+=2;
		}
			
	
	}
}
