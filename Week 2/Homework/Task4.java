
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
		
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] != arr[length - i - 1])
			{
				System.out.println("Не е огледален");
				return;
			}
			if(i == arr.length / 2)
				break;
		}
		
		System.out.println("Огледален е!");
			
	}
	
}
