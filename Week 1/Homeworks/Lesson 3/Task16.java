//  github.com/DaniAngelov

import java.util.Scanner;



public class Task1 
{
	
	static boolean check(int num)
	{
		return num % 50 == 0;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n < 10 || n > 5555 || m < 10 || m > 5555)
			return;
		
		if( n > m)
		{
			for(int i = n;i >= m;i--)
			{
				if(check(i))
					System.out.println(i);
			}
		}
		else
		{
			for(int i = m;i >= n;i--)
			{
				if(check(i))
					System.out.println(i);
			}
		}
	}
	
}
