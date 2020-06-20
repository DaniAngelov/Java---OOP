//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		
		for(int i = 100; i <= 999;i++)
		{
			int lastdigit = i % 10;
			int firstdigit = i / 100;
			int middledigit = (i / 10) % 10;
			
			if(firstdigit != middledigit && middledigit != lastdigit
					&& lastdigit != firstdigit)
			{
				System.out.println(i);
			}
		}
		
	}
}
