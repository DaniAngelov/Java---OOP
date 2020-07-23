//  github.com/DaniAngelov

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
       // int N = sc.nextInt();

        int[] arr = new int[M];

        for(int i = 0;i < M;i++)
        {
            arr[i]= sc.nextInt();
        }
        int counts = 0;
        int number = 0;
        int maxCounts =0;
        for(int i = 0 ;i < M;i++)
        {
            int target = arr[i];
            for(int j = i;j < M;j++)
            {
                if(arr[j] == target)
                {
                    counts++;
                }
            }

            if(counts > maxCounts)
            {
                number = arr[i];
                maxCounts = counts;
            }
            counts = 0;
        }

        System.out.println("Най-много срещания на " + number + " - " + maxCounts);


    }
}
