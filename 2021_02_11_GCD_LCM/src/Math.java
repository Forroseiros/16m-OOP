public class Math {
    // НОД а и б    25 и 15   НОД = 5

    //25-15 = 10
    // 15-10 = 5
    //  10-5 = 5
    //  5-5 = 0
    public static int euclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int euclideanAlgorithmDoWhile(int a, int b) {
        do {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        } while (a != b);
        return a;
    }

    public static int gcdAlgorithm(int a, int b) {

        while (b != 0) {// a! = b
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdRecurcionAlgorithm(int a, int b){
        if(b==0){
            return a;
        }

        return gcdRecurcionAlgorithm(b,a%b);
    }

    //НОК LCM
    //3 и 5 = 15
    //10 и 20 = 20  10*20/НОД 10 = 200/10 = 20

    public static int lcm (int a, int b){
        return a/gcdRecurcionAlgorithm(a, b)*b;
    }
}
