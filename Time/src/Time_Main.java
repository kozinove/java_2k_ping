import java.util.Scanner;

public class Time_Main {
    public static void main(String[] args)
    {
        Time T = new Time();
        int choice;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1.Добавть марку\n" +
                    "2.Удалить марку\n" +
                    "3.Показать все часы\n" +
                    "4.Поменять стрелки часов\n" +
                    "5.Поиск\n"+
                    "0.Выйти\n");
            choice = scan.nextInt();

            switch (choice) {
                case (1): {
                    System.out.println("Введите название марки:");
                    T.brand.add(scan.next());
                    System.out.println("Введите стоимость:");
                    T.cost.add(scan.nextInt());
                    System.out.println("Введите часовую стрелку:");
                    T.hour.add(scan.nextInt());
                    System.out.println("Введите минутную стрелку:");
                    T.minute.add(scan.nextInt());
                    break;
                }
                case (2): {
                    System.out.println("Введите название марки:");
                    String S = scan.next();
                    T.delete(S);
                    break;
                }
                case (3): {
                    T.show();
                    break;
                }
                case (4):{
                    for (int i = 0; i < T.brand.size(); i++) {
                        System.out.println(i + 1 + ".\t" + T.brand.get(i));
                    }
                    System.out.println("Выберите каике часы хотите перевести:");
                    int ch = scan.nextInt() - 1;

                    System.out.println("На сколько часы хотите перевести(в минутах):");
                    int min = scan.nextInt();
                    T.change(ch,min);
                    break;
                }

                case (5):{
                    scan.nextLine();
                    System.out.println("Введите марку:");
                    String S = scan.nextLine();
                    T.search(S);
                    break;
                }
            }

        }while (choice != 0) ;
    }

    }

