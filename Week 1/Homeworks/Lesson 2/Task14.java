//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();
		int pos3 = sc.nextInt();
		int pos4 = sc.nextInt();
			
		int sum1 = pos1 + pos2;
		int sum2 = pos3 + pos4;
		if(sum1 % 2 == sum2 % 2)
		{
			System.out.println("Позициите са с еднакъв цвят");
		}
		else
		{
			System.out.println("Позициите са с различен цвят");
		}
		
	}
}
