
//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[10];
		arr[0] = num;
		arr[1] = num;
		for(int i = 2;i < arr.length;i++)
		{
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		for(int i = 0 ;i < arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
			
	}
	
}
