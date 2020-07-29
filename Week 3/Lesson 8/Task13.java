//  github.com/DaniAngelov

import java.util.Scanner;


public class Task12 {

    public static int[] returnArray(int[] arr1,int[] arr2)
    {
        int k = 0;
       int[] arr = new int[arr1.length + arr2.length];
        for(int i = 0;i < arr1.length + arr2.length;i++)
        {
            if(i < arr1.length)
            {
                arr[i] = arr1[i];
            }
            else {
                arr[i] = arr2[k];
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int M = 6;

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11};

        int[] test = returnArray(arr1,arr2);

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

    }
}
