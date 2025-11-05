public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction addFraction(Fraction f) {
        if (denominator == f.denominator) {
            Fraction newFraction = new Fraction(numerator + f.numerator, denominator);
            return newFraction.simplify();
        } else {
            Fraction newFraction = new Fraction(numerator * f.denominator + f.numerator * denominator, denominator * f.denominator);
            return newFraction.simplify();
        }
    }

    public Fraction multiplyFraction(Fraction f) {
        Fraction newFraction = new Fraction(numerator * f.numerator, denominator * f.denominator);
        return newFraction.simplify();
    }

    public Fraction divideFraction(Fraction f) {
        Fraction newFraction = new Fraction(numerator * f.denominator, denominator * f.numerator);
        return newFraction.simplify();
    }

    public Fraction reciprocal() {
        Fraction newFraction = new Fraction(denominator, numerator);
        return newFraction;
    }

    public Fraction simplify() {
        int divisor = 1;
        int i = 2;
        while (i <= numerator && i <= denominator) {
            if (numerator % i == 0 && denominator % i == 0) {
                divisor = i;
            }
            i++;
        }
        Fraction newFraction = new Fraction(numerator/divisor, denominator/divisor);
        return newFraction;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction f3 = new Fraction(2, 4);

        System.out.println(f1.addFraction(f2).toString()); // 3/4
        System.out.println(f1.addFraction(f3).toString()); // 1/1
        System.out.println(f2.addFraction(f3).toString()); // 3/4
        System.out.println();
        System.out.println(f1.multiplyFraction(f2).toString()); // 1/8
        System.out.println(f1.multiplyFraction(f3).toString()); // 1/4
        System.out.println(f2.multiplyFraction(f3).toString()); // 1/8
        System.out.println();
        System.out.println(f1.divideFraction(f2).toString()); // 2/1
        System.out.println(f1.divideFraction(f3).toString()); // 1/1
        System.out.println(f2.divideFraction(f3).toString()); // 1/2
        System.out.println();
        System.out.println(f1.reciprocal().toString()); // 2/1
        System.out.println(f2.reciprocal().toString()); // 4/1
        System.out.println(f3.reciprocal().toString()); // 4/2
        System.out.println();
        System.out.println(f1.simplify().toString()); // 1/2
        System.out.println(f2.simplify().toString()); // 1/4
        System.out.println(f3.simplify().toString()); // 1/2
    }
}
