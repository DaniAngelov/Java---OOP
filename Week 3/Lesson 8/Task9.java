//  github.com/DaniAngelov

import java.util.Scanner;


public class Task9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words =  str.split("[^-0-9]+");
        int sum = 0;



        for(int i =0;i < words.length;i++)
        {
            for(int j = 0;j < words[i].length();j++)
            {

                if(words[i].charAt(j) =='-')
                {

                    String left = words[i].substring(0, j);
                    if(left.matches(".*\\d.*")) {
                        sum += Integer.parseInt(left);
                    }


                    sum += Integer.parseInt(words[i].substring(j));
                }
                else if(!words[i].contains("-"))
                {

                    sum += Integer.parseInt(words[i].substring(j));
                    break;
                }
                else
                {
                    continue;
                }
            }
        }

        System.out.println("Сума = " + sum);
    }
}
