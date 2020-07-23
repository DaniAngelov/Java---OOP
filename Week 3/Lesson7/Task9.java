//  github.com/DaniAngelov

import java.util.Scanner;

public class Task9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] arr = new int[M][N];

        for(int i = 0;i < M;i++)
        {
            for(int j = 0;j < N;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int max = 0;
        int[][] matrix = new int[2][2];
        for(int i = 0;i < M;i++)
        {
            for(int j = 0;j < N;j++)
            {
                if(i + 1 < N && j + 1 < N) {
                    sum += arr[i][j] + arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1];
                    if (sum > max) {
                        max = sum;
                        matrix[0][0] = arr[i][j];
                        matrix[0][1] = arr[i][j + 1];
                        matrix[1][0] = arr[i + 1][j];
                        matrix[1][1] = arr[i + 1][j + 1];
                    }
                }
                sum = 0;
            }

        }

        System.out.println("MAX SUM : " + max);
        System.out.println("Matrix: ");

        for(int i = 0;i < 2;i++)
        {
            for(int j = 0 ;j < 2;j++)
            {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
