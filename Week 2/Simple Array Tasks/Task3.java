//  github.com/DaniAngelov


import java.util.Scanner;

public class Task1 
{

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
		int days = sc.nextInt();
		int arr[] = new int[days];
		int avg = 0;
		for(int i = 0;i < days;i++)
		{
			System.out.println("Enter temperature for day " + (i + 1) );
			arr[i] = sc.nextInt();
			avg += arr[i];
		}
		avg /= days;
		System.out.println("Average temperature of the month: " + avg);
		
	
		int coldDays = 0;
		int colderDaysStreak = arr[0];
		
		for(int i = 0;i < days;i++)
		{
			if(arr[i] < avg)
			{
				coldDays++;
			}
			
		}
		int max = 0;
		System.out.println("Cold days streak: " + coldDays);

		for(int i = 0;i < days - 1;i++)
		{
			if(arr[i] > arr[i + 1])
			{
				colderDaysStreak++;
			}
			else
			{
				max = colderDaysStreak;
				colderDaysStreak = 0;
			}
			
		}
		System.out.println("Colder days Streak: " + colderDaysStreak);
	}
	
}
