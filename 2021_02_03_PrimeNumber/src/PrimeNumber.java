public class PrimeNumber {
    public static void main(String[] args) {
        //Дано число, найти все ПРОСТЫЕ числе меньше данного числа
        findAllPrimeNumber(10);
    }

    private static void findAllPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int input) {
        int count = 0;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }

        }
        return true;
    }

}
