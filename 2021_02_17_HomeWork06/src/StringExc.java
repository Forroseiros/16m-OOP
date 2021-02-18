public class StringExc {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"

       /* System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false*/
    }

    private static String repeatFront(String input, int n) {
        String output = " ";
        for (int i = 0; i < 1; i++) {
            output += input.substring(0, n);
            for (int j = 0; j < 1; j++) {
                output += input.substring(0, n - 1);
                for (int k = 0; k < 1; k++) {
                    output += input.substring(0, n - 2);

                }
            }
        }
        return output;
    }


}

