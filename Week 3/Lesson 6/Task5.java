//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int N = sc.nextInt();
        //int M = sc.nextInt();
        int[][] arr = new int[4][4];

        for(int i= 0 ;i < 4;i++)
        {
            for(int j =0;j < 4;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        int maxCol = 0;
        int maxRow = 0;
        int counter1 = 0;
        int counter2 = 0;

        for(int i = 0;i < 4;i++)
        {
            int oldMaxCol = maxCol;
            for(int j =0;j < 4;j++)
            {
               counter1 += arr[i][j];
            }
            for(int j = 0;j < 4;j++)
            {
                counter2 += arr[j][i];
            }
            if(maxRow < counter1)
                maxRow = counter1;
            counter1 = 0;

            if(maxCol < counter2)
                maxCol = counter2;
             counter2 = 0;

        }

        System.out.println("Най-голяма сума по редове: " + maxRow);
        System.out.println("Най-голяма сума по колони: " + maxCol);

        if(maxRow > maxCol)
        {
            System.out.println("Максималната сума по редове е > от максималната сума по колони");
        }
        else
        {
            System.out.println("Максималната сума по колони е > от максималната сума по редове");
        }

    }
}
