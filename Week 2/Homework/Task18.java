//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int  arr[] = new int[length];
        int length2 = sc.nextInt();
        int  arr2[] = new int[length2];
        if(length != length2)
        {
            System.out.println("Invalid length!");
            return;
        }
        int arr3[] = new int[length];

        for(int i = 0;i < length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < length;i++)
        {
            arr2[i] = sc.nextInt();
        }


        for(int i =0 ;i < length;i++)
        {
           if(arr[i] > arr2[i])
           {
               arr3[i] = arr[i];
           }
           else
               arr3[i] = arr2[i];
        }

        System.out.println("Array1 : ");

        for(int i = 0;i < length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Array2 : ");

        for(int i = 0;i < length;i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("Array3 : ");

        for(int i = 0;i < length;i++)
        {
            System.out.println(arr3[i]);
        }



    }
}
