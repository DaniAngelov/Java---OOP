//  github.com/DaniAngelov


import java.util.Scanner;

public class Task1 
{

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 
		 for(int i = n;i <= 52;i++)
		 {
			 if( i >= 1 && i <= 4 )
				 System.out.print(2 + " ");
			 else if( i >= 5 && i <= 8 )
				 System.out.print(3 + " ");
			 else if( i >= 9 && i <= 12 )
				 System.out.print(4 + " ");
			 else if( i >= 13 && i <= 16 )
				 System.out.print(5 + " ");
			 else if( i >= 17 && i <= 20 )
				 System.out.print(6 + " ");
			 else if( i >= 21 && i <= 24 )
				 System.out.print(7 + " ");
			 else if( i >= 25 && i <= 28 )
				 System.out.print(8 + " ");
			 else if( i >= 29 && i <= 32 )
				 System.out.print(9 + " ");
			 else if( i >= 33 && i <= 36 )
				 System.out.print(10 + " ");
			 else if( i >= 37 && i <= 40 )
				 System.out.print("Вале ");
			 else if( i >= 41 && i <= 44 )
				 System.out.print("Дама ");
			 else if( i >= 45 && i <= 48 )
				 System.out.print("Поп ");
			 else if( i >= 49 && i <= 52 )
				 System.out.print("Асо ");
			
			 
			 if((i - 1) % 4 == 0)
			 {
				 System.out.println("Спатия");
			 }
			 else if((i - 1) % 4 == 1)
			 {
				 System.out.println("Каро");
			 }
			 else if((i - 1) % 4 == 2)
			 {
				 System.out.println("Купа");
			 }
			 else if((i - 1) % 4 == 3)
			 {
				 System.out.println("Пика");
			 }
			 
				 
			 
			 
		 }
		 
		 
		
		
		
	}
	
}
