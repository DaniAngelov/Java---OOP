//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 10 || num > 9999)
		{
			System.out.println("Please enter valid parameter");
			return;
		}
		
		int all = num / 5;
		int remainder = num % 5;
		
		if(remainder == 0)
		{
			System.out.println(all + " пъти по 2 литра" );
			System.out.println(all + " пъти по 3 литра" );
		}
		else if(remainder == 1)
		{
			System.out.println( (all - 1) + " пъти по 2 литра" );
			System.out.println( (all + 1) + " пъти по 3 литра" );
		}
		
		else if(remainder == 2)
		{
			System.out.println(all + " пъти по 2 литра" );
			System.out.println(all + " пъти по 3 литра" );
			System.out.println("допълнително кофа от 2 литра");
		}
		else if(remainder == 3)
		{
			System.out.println(all + " пъти по 2 литра" );
			System.out.println(all + " пъти по 3 литра" );
			System.out.println("допълнително кофа от 3 литра");
		}
		else if(remainder == 4)
		{
			System.out.println(all + " пъти по 2 литра" );
			System.out.println(all + " пъти по 3 литра" );
			System.out.println("допълнително 2 кофи от 2 литра");
		}
	}
}
