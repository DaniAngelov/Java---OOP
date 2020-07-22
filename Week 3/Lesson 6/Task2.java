//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for(int i = 0;i < N;i++)
        {
            for(int j = 0;j < M;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("First diagonal: ");

        for(int i = 0;i < N;i++)
        {
            for(int j = 0 ;j < M;j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
        System.out.println();
        System.out.println("Second diagonal: ");

        for(int i = 0;i < N;i++)
        {
            for(int j = 0 ;j < M;j++)
            {
                if(i == M - j -1 )
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}
