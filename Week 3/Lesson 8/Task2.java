//  github.com/DaniAngelov

import java.util.Scanner;


public class Task2 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        //String sent2 = sc.nextWord();

        String[] words = sent.split(" ");
        for(int i = 0;i < 2;i++)
        {
            if(words[i].length() < 10 || words[i].length() > 20)
                return;
            else
            {
               String firstFive = words[i].substring(0,5);
               String secFive = words[i + 1].substring(0,5);

               if(words[i].length() > words[i + 1].length())
               {
                   System.out.print(words[i].length() + " " + secFive + words[i].substring(5));
               }
               else
               {
                   System.out.print(words[i + 1].length() + " " + firstFive + words[i + 1].substring(5));
               }

                //System.out.println("Words: " + words[i + 1]);
                break;
            }
        }
        //System.out.println(sent);


    }
}
