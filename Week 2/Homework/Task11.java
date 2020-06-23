//  github.com/DaniAngelov

import java.util.Scanner;


public class Task1 
{
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//int length = sc.nextInt();
		int length = 7;
		int arr[] = new int[length];
		
		for(int i =0 ;i < length;i++)
		{
			arr[i] = sc.nextInt();
		
		}
		
	
		for(int i = 0;i < length;i++)
		{
			if(arr[i] > 5 && arr[i] % 5 == 0)
				System.out.print(arr[i] + " ");
		}
		
		
			
		
		
	}
	
}
