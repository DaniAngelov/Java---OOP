//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i < n;i++)
		{
			for(int k = i;k < n;k++)
			{
				System.out.print(" ");
			}
			
		
			if( i == 0 || i == n - 1)
			{
				for(int j = n - (n - i) + i;j >= 0;j--)
				{
					System.out.print("*");
				
				}
				
			}
			else
			{
				for(int j = n - (n - i);j >= 0;j--)
				{
					if(j == 0 || j == n - (n - i))
					{
						System.out.print("*");
						int oldj = j;
						while(j > 0)
						{
						System.out.print(" ");
						j--;
						}
						j = oldj;
					}
					else
					{
						System.out.print(" ");
					}
				}
			
			}
			System.out.println();
			
		}
		
	}
}
