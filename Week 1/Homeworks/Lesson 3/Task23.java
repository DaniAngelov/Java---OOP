//  github.com/DaniAngelov


import java.util.Scanner;

public class Task1 
{

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int counter = 1;
		int counter2 = 1;
		while(counter < 10)
		{
			if(counter == 1)
			System.out.print("1-ви ред: ");
			else if(counter == 2)
				System.out.print("2-ри ред: ");
			else
				System.out.print(counter + "-ти ред: ");
			while(counter2 < 10)
			{
				if(counter <= counter2)
				System.out.print(counter + "*" + counter2 + "; ");
				counter2++;
			}
			counter2 = 0;
			System.out.println();
			counter++;
		}
		
		
		
	}
	
}
