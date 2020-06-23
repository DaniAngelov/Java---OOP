//  github.com/DaniAngelov

import java.util.Scanner;


public class Task1 
{
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//int length = sc.nextInt();
		
		int num = sc.nextInt();
		int oldnum = num;
		int counter = 0;
		while(num != 0 )
		{
			num /= 2;
			counter++;
			
		}
		int length = counter;
		int arr[] = new int[length];
		
//		for(int i =0 ;i < length;i++)
//		{
//			arr[i] = sc.nextInt();
//		
//		}
		int arrCount = 0;
		num = oldnum;
		while(num != 0)
		{
			
			int temp = num % 2;
			arr[arrCount] = temp;
			arrCount++;
			num /= 2;
		}
		
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	
			
	}
	
}
