//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		int arr1[] = new int[length/2];
		
		for(int i = 0;i < length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i < length /2 ;i ++)
		{
			arr1[i] = arr[i];
		}
		
		int length2 = arr.length - arr1.length;
		int arr2[] = new int[length2];
		
		int count = 0;
		if(length % 2 == 1)
			length2--;
		for(int i = arr.length - 1 ; i >= length2;i--)
		{
			arr2[count] = arr[i];
			//System.out.println(arr2[count]);
			count++;
		
		}
		int combined[] = new int[length];
		int counter = 0;
		for(int i = 0;i < arr1.length;i++)
		{
			combined[i] = arr1[i];
			System.out.println(combined[i]);
			counter++;
		}
		
		count = 0;
		for(int i = counter;i < arr.length;i++)
		{
			combined[i] = arr2[count];
			count++;
		}
		
		for(int i = 0;i < combined.length;i++)
		{
			System.out.print(combined[i] + " ");
		}
			
	}
	
}
