//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int subt = a -b;
		int mult = a * b;
		int div = a / b;
		System.out.println("Sum: " +  sum);
		System.out.println("Subtraction: " +  subt);
		System.out.println("Multiplication: " +  mult);
		System.out.println("Division: " +  div);
	
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		
		float sum2 = c + d;
		float subt2 = c - d;
		float mult2 = c * d;
		float div2 = c / d;
		System.out.println("Sum: " +  sum2);
		System.out.println("Subtraction: " +  subt2);
		System.out.println("Multiplication: " +  mult2);
		System.out.println("Division: " +  div2);
		

	}

}
