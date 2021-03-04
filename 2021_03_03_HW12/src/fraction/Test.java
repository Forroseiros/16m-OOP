package fraction;

import fraction.data.Fraction;
import fraction.dao.Math;
public class Test {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(1,2);
        Fraction fr2 = new Fraction(2,5);
        Fraction result = Math.subtraction(fr1,fr2);
        System.out.println(result);

        Fraction fr3 = new Fraction(4,7);
        Fraction fr4 = new Fraction(2,5);
        Fraction result2 = Math.divide(fr3,fr4);
        System.out.println(result2);

        Fraction fr5 = new Fraction(4,7);
        Fraction fr6 = new Fraction(2,8);
        Fraction result3 = Math.multiply(fr5,fr6);
        System.out.println(result3);
    }

}
