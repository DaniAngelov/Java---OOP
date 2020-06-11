//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if( a < 1000 || a > 9999)
		{
			System.out.println("Please enter a valid parameter!");
		}
		int temp1 = a / 1000;
		int temp2 = a % 10;
		System.out.println(temp1);
		System.out.println(temp2);
		int number1 = temp1 * 10 + temp2 ;
		System.out.println(number1);
		
		int number2 = (a/ 10) % 100;
		if(number1 > number2)
		{
			System.out.println("По-голямо");
		}
		else if(number1 == number2)
		{
			System.out.println("Равни");
		}
		else
		{
			System.out.println("По-малко");
		}
		
		
	}
}
