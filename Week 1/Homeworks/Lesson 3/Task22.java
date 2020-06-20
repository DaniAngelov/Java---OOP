//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 
		 int i = 0;
		int counter = 0;
		while(true)
		{
			if((i % 2 == 0 || i % 5 == 0 || i % 3 == 0) && i > n)
			{
				counter++;
				System.out.print(counter + ":" + i);
				if(counter == 10)
					break;
				System.out.print(", ");
			}
			i++;
		}
		
		
		
	}
	
}
