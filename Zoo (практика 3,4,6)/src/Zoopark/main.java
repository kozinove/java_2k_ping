package Zoopark;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {

        Zoo_Build  z = new Zoo_Build();

        Scanner scan = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1.Добавить клетку\n" +
                    "2.Добавить животное\n" +
                    "3.Убрать животное\n" +
                    "4.Пройтись по зоопарку\n" +
                    "5.Кол-во хищников и травоядных\n" +
                    "6.Записать в файл\n" +
                    "7.Чтение из файла\n" +
                    "0.Выйти\n");

            ch = scan.nextInt();

            switch (ch) {
                case (1) -> z.cells_make();
                case (2) -> z.add_animal();
                case (3) -> z.remove_animal();
                case (4) -> z.show_cells();
                case (5) -> z.show_table();
                case (6) -> z.FileWriter();
                case (7) -> z.FileReader();
            }

        }while (ch != 0);

    }


}
