public class Solution {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(0));
        System.out.println(bunnyEars2(1));
        System.out.println(bunnyEars2(2));
    }

    private static int bunnyEars2(int rabbit) {
        if (rabbit == 0) return 0;
        if (rabbit == 1) return 2;
        return 5 + bunnyEars2(rabbit - 2);
// верни 5 ушей и запусти метод заново с количеством зайцев минус два.
    }

    public static int simpleBunnyEars2(int rabbit) {
        // кролик, кролик, кролик, кролик, кролик, кролик, кролик
        if (rabbit % 2 == 0) {
            return rabbit / 2 * (2 + 3);
        } else {
            return rabbit / 2 * (2 + 3) + 2;
        }
    }
}
