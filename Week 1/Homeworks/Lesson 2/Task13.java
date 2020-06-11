//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		
		if(temperature < -20)
			System.out.println("ледено студено");
		else if(temperature > -20 && temperature <= 0)
			System.out.println("студено");
		else if(temperature > 0 && temperature <= 15)
			System.out.println("хладно");
		else if(temperature > 15 && temperature <= 25)
			System.out.println("топло");
		else
			System.out.println("горещо");
		
			
			
		
	}
}
