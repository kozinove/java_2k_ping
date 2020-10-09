import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {

        animal a = new animal();
        Scanner scan = new Scanner(System.in);

        int ch;

        do {
            System.out.println("1.Слон\n" +
                    "2.Лев\n" +
                    "3.Тигр\n" +
                    "4.Жираф\n" +
                    "0.Выйти\n");
             ch = scan.nextInt();

            switch (ch)
            {
                case(1):
                {
                    a.Elephant();
                    break;
                }
                case(2):
                {
                    a.Lion();
                    break;
                }
                case(3):
                {
                    a.Tiger();
                    break;
                }
                case(4):
                {
                    a.Giraffe();
                    break;
                }

            }

        }while (ch != 0);



    }
}
