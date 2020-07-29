//  github.com/DaniAngelov

import java.util.Scanner;


public class Task3 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();

        String[] words = sent.split(",");
        int length;
        if(words[0].length() < words[1].length()) {
            length = words[0].length();
            System.out.println("Вторият низ е с по-голяма дължина");
        }
        else if(words[0].length() > words[1].length()) {
            length = words[1].length();
            System.out.println("Първият низ е с по-голяма дължина");
        }
        else
        {
            length = words[0].length();
            System.out.println("Низовете са с еднаква дължина");
        }
        for(int i = 0;i < 2;i++)
        {
            System.out.println("Разлика по позиции: ");
            for(int j = 0 ;j < length;j++)
            {
                if(words[i].charAt(j) != words[i + 1].charAt(j))
                {
                    System.out.println(( j + 1) + " " + words[i].charAt(j) + "-" + words[i +1].charAt(j));
                }
            }
            break;
        }


    }
}
