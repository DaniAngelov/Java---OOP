//  github.com/DaniAngelov

import java.util.Scanner;



public class Task1 
{
	

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		if(a < 10 || a > 99)
		{
			System.out.println("Invalid arg");
			return;
		}
		
		
		
		while(a != 1)
		{
			double num = 0;
			if(a % 2 == 0)
			{
				num = 0.5 * a;
			}
			else
			{
				num = 3 * a + 1; 
			}
			System.out.print((int)num + " ");
			a = num;
			
		}
		
	}
	
}
