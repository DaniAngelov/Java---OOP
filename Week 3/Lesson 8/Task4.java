//  github.com/DaniAngelov

import java.util.Scanner;


public class Task4 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        String[] words = sent.split(",");
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ;i < 2;i++) {
            for (int j = 0; j < words[i].length();j++)
            {
                sum1 += words[i].charAt(j);
            }
            for (int j = 0; j < words[i + 1].length();j++)
            {
                sum2 += words[i + 1].charAt(j);
            }
            break;

        }

        if(sum1 > sum2)
        {
            System.out.println(words[0]);
        }
        else
        {
            System.out.println(words[1]);
        }



    }
}
