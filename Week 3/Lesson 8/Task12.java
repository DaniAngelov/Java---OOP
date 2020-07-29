//  github.com/DaniAngelov

import java.util.Scanner;


public class Task12 {

    public static int[] returnArray(int N)
    {
       int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;

        int[] arr = returnArray(N);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
