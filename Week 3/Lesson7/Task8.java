//  github.com/DaniAngelov

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int M = sc.nextInt();
      //  int N = sc.nextInt();

        boolean[][] arr =
                        {{true ,false,false},
                        {false,true,false},
                        {false,false,true}};
        boolean check = false;
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                if(j > i)
                {
                    if(arr[i][j] == true)
                        check = true;

                    break;
                }
            }
        }
        System.out.println(check == true ? "CONTAINS" : "DOES NOT CONTAIN");

    }
}
