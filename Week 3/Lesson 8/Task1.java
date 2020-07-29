//  github.com/DaniAngelov

import java.util.Scanner;


public class Task1 {

    public static void printSent(String sent)
    {
        sent = sent.toUpperCase();
        System.out.print(sent + " ");
        sent = sent.toLowerCase();
        System.out.print(sent + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        String sent2 = sc.nextLine();

        if(sent.length() > 40)
        {
            return;
        }
        printSent(sent);
        printSent(sent2);
    }
}
