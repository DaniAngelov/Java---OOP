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
		int avg = 0;
		for(int i =0 ;i < length;i++)
		{
			arr[i] = sc.nextInt();
			avg += arr[i];
		}
		
		avg /= length;
		int min = 0;
		int num = 0;
		for(int i = 0;i < length;i++)
		{
			int sum = avg - arr[i];
			
			if(i == 0)
				min = sum;
			//System.out.println(avg + " " + arr[i] + " " + sum);
			if(min > Math.abs(sum))
			{
				min = sum;
				num = arr[i];
			}
			sum = 0;
		}
		
		System.out.println("Closest num to the average is : " + num);
			
		
		
	}
	
}
