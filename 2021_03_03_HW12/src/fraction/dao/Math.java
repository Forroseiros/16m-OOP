package fraction.dao;

import fraction.data.Fraction;

public class Math {
    public static Fraction subtraction(Fraction a, Fraction b) {
        int cNumerator;
        int cDenominator;
        cNumerator = a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator();
        cDenominator = lcm(a.getDenominator(), b.getDenominator());
        int reduction = gcdRecursion(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction divide(Fraction a, Fraction b) {
        int cNumerator;
        int cDenominator;
        cNumerator = a.getNumerator() * b.getDenominator();
        cDenominator = a.getDenominator() * b.getNumerator();
        int reduction = gcdRecursion(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static Fraction multiply(Fraction a, Fraction b) {
        int cNumerator;
        int cDenominator;
        cNumerator = a.getNumerator() * b.getNumerator();
        cDenominator = a.getDenominator() * b.getDenominator();
        int reduction = gcdRecursion(cNumerator, cDenominator);//нод

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static int gcdRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursion(b, a % b);
    }

    // находим НОК
    public static int lcm(int a, int b) {
        return a / gcdRecursion(a, b) * b;
    }

}
