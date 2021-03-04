package fraction.data;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int denominator) {
        this.denominator = denominator;
        denominator=1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    @Override
    public String toString() {
        return "Fraction " +
                "numerator=" + numerator +
                ", denominator=" + denominator;
    }
}
