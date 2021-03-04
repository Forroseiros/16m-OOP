public class Task777 {
    public static void main(String[] args) {
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0
        System.out.println(count7(777));// → 3

    }

    private static int count7(int number) {
        if (number % 10 == 7) {
            //717%10 == 7
            //count
            return 1 + count7(number / 10);
        }
        if (number > 7) {
            return 0 + count7(number / 10);
        }
        return 0;
    }
}
