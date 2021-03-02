package data;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int nominator, int denominator) {
        this.numerator = nominator;
        this.denominator = denominator;
    }

    public Fraction(int nominator) {
        this.numerator = nominator;
        denominator = 1;
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "nominator = " + numerator +
                ", denominator = " + denominator +
                '}';
    }

}
