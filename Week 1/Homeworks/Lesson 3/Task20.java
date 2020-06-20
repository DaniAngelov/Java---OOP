//  github.com/DaniAngelov

import java.util.Random;
import java.util.Scanner;



public class Task1 
{

	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		 Random rand = new Random();
		 int counter = 0;
		 int sum = 45;
		 
		 
		while(true)
		{
			int a = rand.nextInt(9) + 1;
			if(sum - a > 0)
			{
				System.out.print(a + " ");
			}
			else if(sum - a == 0)
			{
				counter++;
				System.out.print(a + " ");
				break;
			}
			else
			{
				continue;
			}
			counter++;
			sum -= a;
			
		}
		System.out.println();
		int i = 0;
		while(i != counter - 1)
		{
			sum = 45;
			int counter2 = 0;
			while(true)
			{
				int a = rand.nextInt(9) + 1;
				if(sum - a > 0)
				{
					System.out.print(a + " ");
				}
				else if(sum - a == 0)
				{
					counter2++;
					System.out.print(a + " ");
					break;
				}
				else
				{
					continue;
				}
				counter2++;
				sum -= a;
				if(counter2 > counter)
				{
					i--;
					break;
				}
			}
			System.out.println();
			i++;
		}
		
	}
	
}
