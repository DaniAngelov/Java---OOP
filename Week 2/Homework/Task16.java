//  github.com/DaniAngelov

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double arr[] = new double[length + 1];


        for(int i = 1;i <= length;i++)
        {
            arr[i] = sc.nextDouble();
        }

        System.out.println("Old elements: ");

        for(int i = 1;i <= length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int i = 1;i <= length;i++)
        {

            System.out.print(arr[i] + " ");
            if(arr[i] < -0.231)
            {

                arr[i] = (i * i) + 41.25;
                continue;
            }
            arr[i] *= i;
        }

        System.out.println("New elements: ");
        for(int i = 1;i <= length;i++)
        {
            arr[i] = Math.round(arr[i] * 100.0) /100.0;
            System.out.print(arr[i] + " ");
        }

    }
}
