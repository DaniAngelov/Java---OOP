//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int  arr[] = new int[length];


        for(int i = 0;i < length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < length ;i+=2)
        {
            if((i +2 ) < length) {
                if (arr[i] > arr[i + 1] || arr[i + 1] < arr[i + 2]) {
                    System.out.println("Не е зигзагобразна редица");
                    return;
                }
            }

            System.out.println("I: " + i);
            if(i + 2 >= length)
                break;
        }

        System.out.println("Зигзагобразна редица е!");



    }
}
