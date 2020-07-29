//  github.com/DaniAngelov

import java.util.Scanner;


public class Task11 {

    public static void printArray(int[] arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,3,2,32,31};

        printArray(arr);
        
    }
}
