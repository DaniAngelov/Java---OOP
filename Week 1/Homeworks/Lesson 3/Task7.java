//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 3;
		int counter = 0;
		while(true)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
				counter++;
			}
			if(counter == n)
			{
				break;
			}
			i++;
		}
		
	
		
	
	}
}
