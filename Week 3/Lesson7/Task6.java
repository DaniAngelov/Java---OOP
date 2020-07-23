//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        //int N = sc.nextInt();

        char[][] arr = new char[M][];

        for(int i =0 ;i < M;i++)
        {
            arr[i] = sc.nextLine().toCharArray();
        }

        System.out.println("Primary diagonal : ");

        for(int i = 0;i < M;i++)
        {
            for(int j = 0 ;j < arr[i].length;j++)
            {
                if(i == j)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

