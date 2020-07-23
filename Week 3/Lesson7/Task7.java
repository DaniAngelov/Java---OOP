//  github.com/DaniAngelov

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] arr = new int[M][N];

        for(int i =0 ;i < M;i++)
        {
            for(int j = 0 ;j < N;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int mult = 1;
        for(int i = 0 ;i < M;i++)
        {
            for(int j = 0 ;j < N;j++)
            {
                if(i > j)
                {
                    
                    mult *= arr[i][j];
                }
            }
        }

        System.out.println("Произведението под главния диагонал е : " + mult);




    }
}
