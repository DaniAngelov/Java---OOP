//  github.com/DaniAngelov

import java.util.Scanner;


public class Task8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check = true;
        for(int i =0 ;i < str.length();i++)
        {
            if(i > str.length() / 2)
                break;
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                check =false;
        }

        if(check == true)
        {
            System.out.println("Да");
        }
        else
        {
            System.out.println("Не");
        }
    }
}
