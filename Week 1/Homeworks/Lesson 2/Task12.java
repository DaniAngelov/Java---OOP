//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		switch(month)
		{
			case 1:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter in January");
					return;
				}
				if(day == 31)
				{
					System.out.println("1," + month++ + "," + year);
					break;
				}
				
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 2:
			{
				if(day <= 0 || day > 29)
				{
					System.out.println("not a valid parameter in February");
					return;
				}
				else if(day == 29 && year % 4 != 0)
				{
					System.out.println("not a leap year!");
					return;
				}
				
				if(day == 28 || day == 29)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				
				System.out.println(++day + "," + month + "," + year);
				break;
				
			}
			case 3:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter");
					return;
				}
				if(day == 31)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 4:
			{
				if(day <= 0 || day > 30)
				{
					System.out.println("not a valid parameter");
					return;
				}
				if(day == 30)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 5:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter");
					return;
				}
				if(day == 31)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 6:
			{
				if(day <= 0 || day > 30)
				{
					System.out.println("not a valid parameter");
					return;
				}
				if(day == 30)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 7:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter");
				}
				if(day == 31)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 8:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter");
				}
				if(day == 31)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 9:
			{
				if(day <= 0 || day > 30)
				{
					System.out.println("not a valid parameter");
				}
				if(day == 30)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 10:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter");
				}
				if(day == 31)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 11:
			{
				if(day <= 0 || day > 30)
				{
					System.out.println("not a valid parameter");
				}
				if(day == 30)
				{
					System.out.println("1," + ++month + "," + year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
			case 12:
			{
				if(day <= 0 || day > 31)
				{
					System.out.println("not a valid parameter");
				}
				if(day == 31)
				{
					month = 1;
					System.out.println("1," + month + "," + ++year);
					break;
				}
				System.out.println(++day + "," + month + "," + year);
				break;
			}
		}
	}
}
