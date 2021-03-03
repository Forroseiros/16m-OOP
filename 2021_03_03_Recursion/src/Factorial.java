public class Factorial {
    // 7! = 7* (7-1) * 5* 4*3 *2*1
    public int findFactorial(int n) {
        if (n == 1) return 1;
        return n * findFactorial(n - 1);
    }
}

class TestFactorial{
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.findFactorial(1));
        System.out.println(fact.findFactorial(2));
        System.out.println(fact.findFactorial(3));
    }
}
