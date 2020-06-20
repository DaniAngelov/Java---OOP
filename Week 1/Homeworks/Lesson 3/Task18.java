//  github.com/DaniAngelov

import java.util.Scanner;



public class Task1 
{
	

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a < 1 || a > 9 || b < 1 || b > 9){
			System.out.println("Invalid args!");
			return;
		}
		
		for(int i = 1;i <= a;i++)
		{
			for(int j = 1;j <= b;j++)
			{
				System.out.println(i + "*" + j + "= " + (i * j));
			}
		}
		
	}
	
}
