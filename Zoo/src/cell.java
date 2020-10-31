import java.util.Scanner;

public class cell{

    int x;
    int an;


    Scanner scan = new Scanner(System.in);

    animal a = new animal();
    cell[] cells = new cell[4];

    void cells()
    {
        cells[0] = new cell();
        cells[1] = new cell();
        cells[2] = new cell();
        cells[3] = new cell();

        int in;

        do {

            System.out.println("Какую клетку хотите настроить?\n" +
                    "1. Клетка № 1\n"+
                    "2. Клетка № 2\n"+
                    "3. Клетка № 3\n"+
                    "4. Клетка № 4\n"+
                    "0. Выйти в главное меню\n");
            x = scan.nextInt();
            if(x != 0) {
                System.out.println("Какое животное добавить в клетку?\n" +
                                 "1. Жираф\n" +
                                 "2. Лев\n" +
                                 "3. Тигр\n" +
                                 "4. Слон\n");
                in = scan.nextInt();

                if(cells[x - 1].an == 1 && in == 2 ||
                        cells[x - 1].an == 1 && in == 3 ||
                        cells[x - 1].an == 4 && in == 2 ||
                        cells[x - 1].an == 4 && in == 1 ||
                        cells[x - 1].an == 3 && in == 1 ||
                        cells[x - 1].an == 3 && in == 4 ||
                        cells[x - 1].an == 2 && in == 1 ||
                        cells[x - 1].an == 2 && in == 4)
                {
                    System.out.println("Хищник начал охоту");
                }
                if(cells[x - 1].an == 2 && in == 3 ||
                        cells[x - 1].an == 3 && in == 2)
                {
                    System.out.println("Лев и тигр начали драку");
                }

                if(cells[x - 1].an == 1 && in == 4 ||
                        cells[x - 1].an == 4 && in == 1)
                {
                    System.out.println("Слон и жираф встретились");
                }

                cells[x - 1].an = in;
}

        }while(x != 0);

    }


    void walk()
    {

        for (int i = 0; i < cells.length; i++)
        {
            System.out.print("В клетке № " + (i + 1) + " находится " );

            if(cells[i].an == 1)
            {
                System.out.println("Жираф");
              a.Giraffe();
            }
            else if(cells[i].an == 2)
            {
                System.out.println("Лев");
                a.Lion();
            }
            else if(cells[i].an == 3)
            {
                System.out.println("Тигр");
                a.Tiger();
            }
            else if(cells[i].an == 4)
            {
                System.out.println("Слон");
                a.Elephant();
            }
            else
            {
               System.out.println("Клетка пустая");
            }
        }

    }
}

