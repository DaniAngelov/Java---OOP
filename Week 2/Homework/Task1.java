//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		arr[0] = sc.nextInt();
		int min = arr[0];
		
		for(int i = 0;i < length - 1;i++)
		{
			arr[i] = sc.nextInt();
		
			if(arr[i] % 3 == 0)
			{
				if(min > arr[i])
				{
					min = arr[i];
				}
			}
		}
		System.out.println("Най-малкото число кратно на 3 е : " +  min);
	}
	
}
