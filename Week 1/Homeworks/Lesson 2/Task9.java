//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < 10 || a > 99 || b < 10 || b > 99)
		{
			System.out.println("Enter valid parameter");
		}
		int mult = a * b;
		int lastDigit = mult % 10;
		if( lastDigit % 2 == 0){
			System.out.println(mult + " ," + lastDigit + " четна");
		} 
		else
		{
			System.out.println(mult + " ," + lastDigit + " нечетна");
		}
	}
}
