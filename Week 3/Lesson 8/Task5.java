//  github.com/DaniAngelov

import java.util.Scanner;


public class Task5 {


    public static void printWords(String word1,String word2,int pos)
    {


        for(int i = 0 ;i < word1.length();i++)
        {

            if(i != pos + 1)
            System.out.println(word1.charAt(i));
            if(i == pos)
            {
                for(int j = 0;j < word2.length();j++)
                {
                    System.out.print(word2.charAt(j) + " ");

                }
                System.out.println();
            }
            else if(i == pos + 1)
                continue;





        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(",");

        int length = 0;

        if(words[0].length() < words[1].length())
        {
            length = words[0].length();
        }
        else
        {
            length = words[1].length();
        }
        for(int i = 0;i < 2;i++)
        {
            for(int j = 0 ;j < length;j++ )
            {
                if(words[i].charAt(j) == words[i + 1].charAt(j))
                {
                    int pos = j + 1;
                    printWords(words[i],words[i + 1], j);
                }
            }
            break;
        }


    }
}
