//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for(int i= 0 ;i < N;i++)
        {
            for(int j =0;j < M;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        int sum = 0;
        int count = 0;

        for(int i = 0 ;i < N;i++)
        {
            for(int j = 0;j < M;j++)
            {
                sum += arr[i][j];
                count++;
            }
        }
        int avg = sum / count;
        System.out.println("SUM of all elements: " + sum);
        System.out.println("AVG of all elements: " + avg);

    }
}
