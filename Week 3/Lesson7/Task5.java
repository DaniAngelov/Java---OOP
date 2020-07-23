//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] arr = new int[M][N];
        int sum =0 ;
        int max = 0;
        int line = -1 ;
        for(int i = 0;i < M;i++)
        {
            for(int j = 0;j < N;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ;i < M;i++)
        {
            for(int j = 0 ;j < N;j++)
            {
                sum += arr[i][j];
            }
            if(max < sum) {
                max = sum;
                line = i + 1;
            }

        }

        System.out.println("Line is " + line);
    }
}
