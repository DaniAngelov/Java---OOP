//  github.com/DaniAngelov

import java.util.Scanner;


public class Task14 {

    public static int factoriel(int N)
    {
        int mult = 1;
        for(int i = 1;i <= N;i++)
        {
            mult *= i;
        }

        return mult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 4;

        System.out.println(factoriel(N));

    }
}
