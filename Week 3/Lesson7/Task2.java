//  github.com/DaniAngelov

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean check = true;
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < N; i+=2)
        {
            if(arr[i] < arr[i - 1] || arr[i] > arr[i + 1])
            {
                check = false;
            }
            if(i + 2 >= N)
                break;
        }

        if(check == true)
        {
            System.out.println("Назъбен е");
        }
        else
        {
            System.out.println("Не е назъбен");
        }

    }
}
