//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0 || num > 24)
		{
			System.out.println("not a valid parameter");
			return;
		}
		
		if(num >= 4 && num <= 9)
		{
			System.out.println("Добро утро");
		}
		else if(num >= 9 && num <= 18)
		{
			System.out.println("Добро ден");
		}
		else if( (num >= 18 && num <= 24) || (num >= 0 && num <= 4))
		{
			System.out.println("Добър вечер");
		}
			
		
	
	}
}
