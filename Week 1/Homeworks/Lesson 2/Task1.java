package Tasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А:");
		float a = sc.nextFloat();
		
		System.out.println("Въведете B:");
		float b = sc.nextFloat();
		
		System.out.println("Въведете C:");
		float c = sc.nextFloat();
		
		if(c > a && c < b)
		{
			
			System.out.println("Числото " + c + " е между " + a + " и " + b);
		}
		
		

	}

}
