
//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array length");
		int length = sc.nextInt();
		System.out.println("Enter second array length");
		int length2 = sc.nextInt();
		int arr[] = new int[length];
		int arr2[] = new int[length2];
		
		for(int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i < arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		if(arr.length == arr2.length)
		{
			System.out.println("They have the same size!");
			
			for(int i = 0 ;i < arr.length;i++)
			{
				if(arr[i] != arr2[i])
				{
					System.out.println("They are not EQUAL! ");
					return;
				}
	
			}
			
			System.out.println("THEY ARE EQUAL!!!");
		}
		else
		{
			System.out.println("They DO NOT have the same size!");
			System.out.println("They ARE NOT EQUAL!");
		}
		
		
	}
	
}
