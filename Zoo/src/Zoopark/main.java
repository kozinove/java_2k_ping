package Zoopark;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        cell c = new cell();
        animal a = new animal();

        c.initial_cells();

        Scanner scan = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1.Настройка клеток\n" +
                    "2.Купить клетку\n" +
                    "3.Пройтись по зоопарку\n" +
                    "4.Вывести Уникальные типы животных\n" +
                    "0.Выйти\n");

            ch = scan.nextInt();

            switch (ch) {
                case (1) -> c.cells();
                case (2) -> c.add_cell();
                case (3) -> c.walk();
                case (4) -> c.unic();
            }

        }while (ch != 0);
    }
}
