//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int reversed = 0;
		int oldn = n;
		while(n != 0)
		{
			int remainder = n % 10;
		
			reversed = reversed * 10 + remainder;
			n /= 10;
		}
		n= oldn;
		System.out.println(reversed);
		
		if(reversed == n)
			System.out.println("Is palindrom");
		else
			System.out.println("Not a  palindrom");
		
	}
	
}
