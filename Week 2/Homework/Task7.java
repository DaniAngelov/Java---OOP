
//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		for(int i = 0;i < length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		int copy[] = new int[length];
		
		for(int i = 0;i < length;i++)
		{
			if(i == 0 || i == length - 1)
			{
				copy[i] = arr[i];
				System.out.print(copy[i] + " ");
				continue;
			}
			
			copy[i] = arr[i - 1] + arr[i + 1];
			System.out.print(copy[i] + " ");
		}
		
	}
	
}
