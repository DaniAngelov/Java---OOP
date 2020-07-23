//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int N = sc.nextInt();
        //int M = sc.nextInt();
        int[][] arr = new int[6][6];

        for(int i= 0 ;i < 6;i++)
        {
            for(int j =0;j < 6;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int sumOfLine = 0;
        int sumAll = 0;

        for(int i= 0 ;i < 6;i++)
        {
            for(int j =0;j < 6;j++)
            {
                if(i  % 2 == 1)
                {
                    sumOfLine += arr[i][j];
                    if(j != 5)
                    System.out.print(arr[i][j] + ",");
                    else
                    {
                        System.out.println(" Сума: " + sumOfLine);
                    }


                }

            }
            sumAll += sumOfLine;
            sumOfLine = 0;

        }
        System.out.println("Сумата на елементите е: " + sumAll);

    }
}
