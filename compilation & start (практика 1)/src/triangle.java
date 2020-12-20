import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ch;
        double a,b,c;
        do {
            System.out.println("Введите 1 сторону треугольника:");
            a = scan.nextDouble();
            System.out.println("Введите 2 сторону треугольника:");
            b = scan.nextDouble();
            System.out.println("Введите 3 сторону треугольника:");
            c = scan.nextDouble();

            if (a==b && b==c){

                System.out.println("Треугольник равностороний");
            }
            else if(a==b && b!=c || b==c && c!=a){
                System.out.println("Треугольник равнобедренный");
            }
            else if (a!=b && b!=c && a!=c) {
                System.out.println("Треугольник разностороний");

            }
            else if(a + b < c || a + c < a || c + b < a)
            {
                System.out.println("Нет такого треугольника");
            }
            System.out.println("Продолжить?");
            ch = scan.nextInt();
        }while (ch != 0);

    }
}
