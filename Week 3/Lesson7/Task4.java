//  github.com/DaniAngelov

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();

        int[] arr = {1,0,1,0,0,0,1,1,1,0,1,0,1,0,1};

        int zeroes = 0;

        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == 0)
                zeroes++;
        }

        for(int i = 0;i < arr.length;i++)
        {
            if(i < zeroes)
            {
                arr[i] = 0;
            }
            else
                arr[i] = 1;
        }

        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
}
