import java.util.Scanner;

public class marks {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int ch;
        do {
            int a, sum = 0;
            System.out.println("Введите число:");
            a = scan.nextInt();

            while ( a != 0){
                sum += (a % 10);
                a/=10;

            }
            System.out.println(sum);


            System.out.println("\nПродолжить?");
            ch = scan.nextInt();

        }while (ch != 0);


    }
}
