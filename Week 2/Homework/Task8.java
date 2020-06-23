
//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		for(int i =0 ;i < length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 1;
		int max = 1;
		
		for(int i= 0;i < length - 1;i++)
		{
			if(arr[i] == arr[i + 1])
			{
				count++;
			}
			else
			{
				if(max < count)
				max = count;
				count = 1;
			}
						
		}
		
		System.out.println(max);
			
	}
	
}
