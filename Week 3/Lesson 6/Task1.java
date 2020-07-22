//  github.com/DaniAngelov


import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[][] = new int[N][M];

        for(int i =0;i < N;i++)
        {
            for(int j = 0;j < M;j++)
            {
                arr[i][j] = sc.nextInt();

            }
        }

        int min = arr[0][0];
        int max = 0;

        for(int i =0;i < N;i++)
        {
            for(int j = 0;j < M;j++)
            {
                if(arr[i][j] < min)
                    min = arr[i][j];

                if(arr[i][j] > max)
                    max = arr[i][j];

            }
        }

        System.out.println("Biggest: " + max);
        System.out.println("Smallest: " + min);


    }
}
