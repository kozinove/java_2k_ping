import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi
{

    public static void main(String[] args) {

        ArrayList<Integer> Fibonachi = new ArrayList();

        Scanner scan = new Scanner(System.in);
        int n, ch;


        do {
            System.out.println("Сколько чисел вывести:");
            n = scan.nextInt();
            Fibonachi.add(0, 1);
            Fibonachi.add(1, 1);

            System.out.print(Fibonachi.get(0) + "\t");
            for (int i = 1; i < n; i++) {

                System.out.print(Fibonachi.get(i) + "\t");

                Fibonachi.add(i + 1, Fibonachi.get(i) + Fibonachi.get(i - 1));
            }

            System.out.println("\n\nПродолжить?");
            ch = scan.nextInt();

        } while (ch != 0);
    }
}

