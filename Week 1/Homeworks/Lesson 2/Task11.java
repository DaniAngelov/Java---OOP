//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if( num < 100 || num > 999)
		{
			System.out.println("Invalid arguments");
			return;
		}
		if(num % 10 == 0 || (num % 100) % 10 == 0)
		{
			System.out.println("There must be no 0 in the integer");
			return;
		}
		
		int first = num / 100;
		int second = (num % 100) / 10;
		int third = num % 10;
		if( num % first == 0 && num % second ==0 && num % third == 0)
		{
			System.out.println("дели се");
		}
		else
		{
			System.out.println("не се дели");
		}
	}
}
