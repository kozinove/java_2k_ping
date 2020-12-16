import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите числитель 1 дроби");
            int n1 = scanner.nextInt();
            System.out.println("Введите знаминатель 1 дроби , если число целлове введите 1");
            int d1 = scanner.nextInt();
            System.out.println("Введите числитель 2 дроби");
            int n2 = scanner.nextInt();
            System.out.println("Введите знаминатель 2 дроби , если число целлове введите 1");
            int d2 = scanner.nextInt();

            Fraction f1 = new Fraction(n1, d1);
            String f1Str = f1.toString();
            System.out.println("Первая дробь =  " + f1Str);
            Fraction f2 = new Fraction(n2, d2);
            String f2Str = f2.toString();
            System.out.println("Вторая дробь =  " + f2Str);
            Fraction temp = new Fraction(f1);


            temp.add(f2);
            System.out.println(f1Str + " + " + f2Str + " = " + temp.toString());
            temp.setValue(f1);

            temp.substract(f2);
            System.out.println(f1Str + " - " + f2Str + " = " + temp.toString());
            temp.setValue(f1);

            temp.multiply(f2);
            System.out.println(f1Str + " * " + f2Str + " = " + temp.toString());
            temp.setValue(f1);

            try {
                temp.divide(f2);
                System.out.println(f1Str + " / " + f2Str + " = " + temp.toString());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

