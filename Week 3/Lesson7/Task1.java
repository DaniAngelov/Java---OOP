//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean check = true;
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] < 0)
                check =false;
        }

        if(check == true)
        {
            System.out.println("Всички числа са неотрицателни");
        }
        else
        {
            System.out.println("НЕ всички числа са неотрицателни");
        }
    }
}
