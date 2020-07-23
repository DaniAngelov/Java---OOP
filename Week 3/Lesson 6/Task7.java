//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int N = sc.nextInt();
        //int M = sc.nextInt();
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sumOfLine = 0;
        int sumAll = 0;
        int k = 0;
        for (int i = 0; i < 6; i++)
        {
            if((i + k)%2 == 0 || i % 2 == 1)
            {
                if(i % 2 == 1)
                {
                    k = 1;
                }
                sumOfLine += arr[i][k];
                if(k + 2 < 6) {
                    System.out.print(arr[i][k] + ", ,");
                    k+=2;
                }
                sumOfLine += arr[i][k];
                if(k + 2 < 6) {
                    System.out.print(arr[i][k] + ", ,");
                    k+=2;
                }
                sumOfLine += arr[i][k];
                if(k + 2 < 6) {
                    System.out.print(arr[i][k] + ", ,");
                    k+=2;
                }

            }
            System.out.println("Сумата от елементите на реда е: " + sumOfLine);
            k = 0;
            sumAll += sumOfLine;
            sumOfLine = 0;
         }
        System.out.println("Сумата на елементите е: " + sumAll);

    }
}
