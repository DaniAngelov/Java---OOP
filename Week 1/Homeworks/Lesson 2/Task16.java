//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		if(num < 100 || num > 999)
		{
			System.out.println("invalid parameter");
			return;
		}
		
		int first = num / 100;
		int second = (num % 100) / 10;
		int third = num % 10;
		
		if(first == second && second == third)
		{
			System.out.println("цифрите са равни");
		}
		else if(first < second && second < third)
		{
			System.out.println("цифрите са във възходящ ред");
		}
		else if(first > second && second > third)
		{
			System.out.println("цифрите са в низходящ ред");
		}
		else
		{
			System.out.println("цифрите са ненаредени");
		}
		
	
	}
}
