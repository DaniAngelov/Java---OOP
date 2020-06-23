//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double arr[] = new double[length];
        double copy[] = new double[length];
        int k = 0;
        for(int i = 0;i < length;i++)
        {
            arr[i] = sc.nextDouble();
            if(arr[i] >= -2.99 && arr[i] <= 2.99)
            {
                copy[k] = arr[i];
                k++;
            }
        }

        for(int i =0 ;i < k;i++)
        {
            System.out.print(copy[i] + " ");
        }
    }
}
