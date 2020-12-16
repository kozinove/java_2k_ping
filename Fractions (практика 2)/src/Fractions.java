public class Fractions {

    public static int gcd(int a, int b)
    {
        return (b == 0 ? a : gcd(b, a % b));
    }
}

class Fraction {

    private int n, d;

    public Fraction(int n, int d) throws IllegalArgumentException {
        setValue(n, d);
    }
    public Fraction(Fraction f) {
        setValue(f);
    }

    public void setValue(int n, int d) throws IllegalArgumentException {
        if (d == 0)
            throw new IllegalArgumentException("Знаминатель не может быть равен 0 ");
        this.n = n;
        this.d = d;
        reduce();
    }
    public void setValue(Fraction f) { this.n = f.n; this.d = f.d; }

    private void reduce() {
        int gcd = Fractions.gcd(n, d);
        n /= gcd;
        d /= gcd;
        if (d < 0) { d *= -1; n *= -1; }
    }
    private void add(int n, int d) {
        this.n = this.n * d + n * this.d;
        this.d *= d;
        reduce();
    }
    private void substract(int n, int d) {
        add(n * -1, d);
    }
    private void multiply(int n, int d) {
        this.n *= n;
        this.d *= d;
        reduce();
    }
    private void divide(int n, int d) {
        this.n *= d;
        this.d *= n;
        reduce();
    }


    public void add(Fraction f) {
        add(f.n, f.d);
    }


    public void substract(Fraction f) {
        substract(f.n, f.d);
    }

    public void multiply(Fraction f) {
        multiply(f.n, f.d);
    }


    public void divide(Fraction f) throws ArithmeticException {
        if (f.n == 0) throw new ArithmeticException("Error: Деление на 0");
        divide(f.n, f.d);
    }



    public String toString() {
        return n + "/" + d;
    }
}
