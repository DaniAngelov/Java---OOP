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
			for(int j = n - (n - i) + i ;j >= 0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
