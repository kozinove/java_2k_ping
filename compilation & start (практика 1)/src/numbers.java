import java.util.Scanner;

public class numbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n,ch;
        double h, h1 = 0;

        do {

            System.out.println("Сколько чисел вывести:");
            n = scan.nextInt();

            for (int i = 1; i < n + 1; i++) {

                h = 1 / i;
                h1 += h;
                System.out.println(h1 + " ");
            }

            System.out.println("\n\nПродолжить?");
            ch = scan.nextInt();

        }while (ch!=0);

    }
}
