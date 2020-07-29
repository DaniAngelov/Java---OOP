//  github.com/DaniAngelov

import java.util.Scanner;


public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int max = 0;

        for(int i = 0 ;i < words.length;i++)
        {
            if(max < words[i].length())
            {
                max = words[i].length();
            }
        }

        System.out.println(words.length + " думи,най-дългата е с " + max + " символа.");

    }
}
