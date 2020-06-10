//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		float sum = sc.nextFloat();
		boolean healthy = sc.nextBoolean();
		
		if(!healthy && sum > 0)
		{
			
			System.out.println("Ще си купя лекарства");
			
		
		}
		else if(!healthy && sum <= 0)
		{
			System.out.println("Ще си стоя вкъщи и ще пия чай");
		}
		else if(!healthy)
		{
			System.out.println("Няма да излизам");
		}
		else if(healthy && sum > 10)
		{
			System.out.println("Ще отида на кино с приятели");
		}
		
		else if(healthy && sum <= 10)
		{
			System.out.println("Ще отида на кафе");
		}
		
		
	}
}
