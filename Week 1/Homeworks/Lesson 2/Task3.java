//  github.com/DaniAngelov

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Old A: " + a + " B: " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("New A: " + a + " B: " + b);
	}

}
