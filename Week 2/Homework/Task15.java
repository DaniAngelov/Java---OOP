//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double  arr[] = new double[length];


        for(int i = 0 ;i < length;i++)
        {
            arr[i] = sc.nextDouble();
        }

        for(int i = 0;i < length;i++)
        {
            for(int j = i + 1;j < length;j++)
            {
                if(Math.abs(arr[i]) < Math.abs(arr[j]))
                {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);


    }
}
