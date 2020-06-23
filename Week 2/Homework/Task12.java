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
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		arr[2] += arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] -= arr[3];
		
		arr[4] *= arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] /= arr[5];
		
		for(int i = 0;i < length;i++)
		
		{
			System.out.println(arr[i] + " ");
		}
			
		
		
	}
	
}
