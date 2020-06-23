//  github.com/DaniAngelov


import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number of dates in the month that are holidays: ");
		int days = sc.nextInt();
	
		
		int sum = 0;
		int max = 0;
		int month = 0;
		int copy[] = new int[days];
		int date[] = new int[31];
		
		for(int i =0 ;i < 6;i++)
		{
			if(i != 0)
			{
				System.out.println("Enter days of next month!");
				days = sc.nextInt();
			}
			int arr[] = new int[6 * days];
			sum = 0;
			for(int j = 0;j < days;j++)
			{
				System.out.println("Enter date for month " + (i + 1) + " : ");
				arr[j] = sc.nextInt();
				date[arr[j] - 1]++;
				sum++;
			}
			
			
			if(sum > max)
			{
				copy = arr;
				max = sum;
			}
		}
		
		System.out.println("DATE: ");
		
		int streak = 0;
		
		for(int i = 0;i < 31;i++)
		{
			
			System.out.println("Day: " + (i + 1) + " : " );
			System.out.println(date[i]);
		}
		int max2 = 0;
		for(int i =0;i < 30;i++)
		{
			if(date[i + 1]  == 0)
			{
				max2 = streak;
				streak =0;
			}
			
			streak++;
		}
		
		System.out.println("Biggest streak: " + max2 );
		
		
		System.out.println("Biggest month free days:");
		
	
		for(int i =0;i < copy.length;i++)
		{
			System.out.println(copy[i]);
		}
		
		
		
	}
	
}
