import java.util.Scanner;

public class numbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int ch;


        do {
            double a, h, h1 = 0 ,i = 1;

            System.out.println("Выведите число : ");
            a = scan.nextInt();

            do {
                h = 1 / i;
                h1 += h;
                i ++;
            }while (a < h1);

            System.out.println("\n" + h1);

            System.out.println("\n\nПродолжить?");
            ch = scan.nextInt();

        }while (ch!=0);

    }
}
