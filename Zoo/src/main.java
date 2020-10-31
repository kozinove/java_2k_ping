import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {

        cell z = new cell();

        Scanner scan = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1.Настройка клеток\n" +
                    "2.Пройтись по зоопарку\n" +
                    "0.Выйти");

            ch = scan.nextInt();

            switch (ch) {
                case (1) -> z.cells();
                case (2) -> z.walk();
            }

        }while (ch != 0);
    }
}
