package Tasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �:");
		float a = sc.nextFloat();
		
		System.out.println("�������� B:");
		float b = sc.nextFloat();
		
		System.out.println("�������� C:");
		float c = sc.nextFloat();
		
		if(c > a && c < b)
		{
			
			System.out.println("������� " + c + " � ����� " + a + " � " + b);
		}
		
		

	}

}
