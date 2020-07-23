//  github.com/DaniAngelov

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[] arr = sc.next().toCharArray();

        System.out.println("Enter specific character: ");
        char ch = sc.next().charAt(0);
        boolean check = false;
        int index = 0;

        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == ch)
            {
                check = true;
                System.out.println("Element index: " + i);
            }
        }

        if(check == true)
            System.out.println("Contains the char") ;
        else
            System.out.println("Does not contain the char");


    }
}
