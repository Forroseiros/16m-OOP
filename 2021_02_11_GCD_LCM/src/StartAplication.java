public class StartAplication {
    public static void main(String[] args) {
        System.out.println(Math.euclideanAlgorithm(25, 15));//5
        System.out.println(Math.euclideanAlgorithm(37, 36));//1
        System.out.println(Math.euclideanAlgorithm(12, 48));//12

        System.out.println(Math.euclideanAlgorithmDoWhile(25, 15));
        System.out.println(Math.euclideanAlgorithmDoWhile(37, 36));
        System.out.println(Math.euclideanAlgorithmDoWhile(12, 48));

        System.out.println(Math.gcdRecurcionAlgorithm(25, 15));
        System.out.println(Math.gcdRecurcionAlgorithm(37, 36));
        System.out.println(Math.gcdRecurcionAlgorithm(12, 48));
    }
}
