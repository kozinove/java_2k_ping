import java.util.ArrayList;
import java.util.Scanner;

public class N {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int ch;
            ArrayList<Integer> Numbers = new ArrayList<>();
            do {
                int a, sum = 0;
                System.out.println("Введите число от 1 до 27 :");
                a = scan.nextInt();

                for (int i = 0; i < 999; i++) {

                    while ( i != 0) {

                        sum += (a % 10);
                        i /= 10;
                    }
                    if(sum == a)
                    {
                        Numbers.add(i);
                    }
                    
                }
                for (int i = 0; i < Numbers.size(); i++) {

                    System.out.println(Numbers.get(i));


                }
                System.out.println("\nПродолжить?");
                ch = scan.nextInt();

            }while (ch != 0);


        }

    }
