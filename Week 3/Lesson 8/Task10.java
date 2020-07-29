//  github.com/DaniAngelov

import java.util.Scanner;


public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();




        for(int i = 0;i < str.length();i++)
        {
            System.out.print((char)(str.charAt(i) + 5));

        }


    }
}
