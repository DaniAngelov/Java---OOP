//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = a;i <= b;i++)
		{
			if(i % 3 == 0)
			{
				System.out.println("skip " + i);
				continue;
			}
			System.out.println(i * i);
			sum+=i;
			if(sum > 200)
			{
				System.out.println("Sum over 200!");
				break;
			}
			
		}
	
	}
}
