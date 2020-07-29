//  github.com/DaniAngelov

import java.util.Scanner;


public class Task6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        for(int i = 0;i < words.length;i++)
        {
            String first = words[i].substring(0,1);
            first = first.toUpperCase();
            System.out.print(first + words[i].substring(1) + " ");
        }


    }
}
