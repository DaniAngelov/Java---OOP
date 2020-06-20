//  github.com/DaniAngelov

import java.util.Scanner;



public class Task1 
{
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char sym = sc.next().charAt(0);
		
		for(int i = 0;i <n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				if(i == 0 || i == n - 1)
				{
					System.out.print("*");
				}
				else
				{
					if(j == 0 || j == n - 1)
					{
						System.out.print("*");
					}
					else
						System.out.print(sym);
				}
			}
			System.out.println();
		}
		
		
	}
	
}
