//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ( a > b)
		{
			System.out.println(a + "\n" + b);
		}
		else
		{
			System.out.println(b + "\n" + a);
		}
		
	}

}
