package lessonStart;

public class CalculatorMath {
    public static int arithmeticOperation(int a, int b, char c) {
        switch (c) {
            case '+':
                return addition(a, b);
            case '-':
                return subtraction(a, b);
            case '/':
                return divide(a, b);
            case '*':
                return multiply(a, b);
            default:
                return -1;
        }
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    /**
     *  a must be greater as b. b cant be zero
     * @param a
     * @param b
     * @return
     */
    private static int divide(int a, int b) {
        double x =  a;
        double y = b;

        return (int) (x / y);
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int addition(int a, int b) {
        return a + b;
    }

}

class Test {
    public static void main(String[] args) {
        CalculatorMath.arithmeticOperation(10, 20, '+');
        CalculatorMath.arithmeticOperation(10, 20, '-');
    }

}
