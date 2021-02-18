public class ExeArray {
    //Given an array of ints, return true if the array contains no 1’s and no 3’s.
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};

        System.out.println(lucky13(arr1));// → true
        System.out.println(lucky13(arr2));// → false
        System.out.println(lucky13(arr3));// → false

        int[] array1 = new int[4];
        int[] array2 = new int[0];
        int[] array3 = new int[10];

        printArrayForEach(array1);// → [0, 1, 2, 3]
        printArrayForEach(array2);// → [0]
        printArrayForEach(array3);// → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 3, 4};
        int[] arr6 = new int[]{2, 3, 4};

        System.out.println(no14(arr4));// →true
        System.out.println(no14(arr5));// →false
        System.out.println(no14(arr6));// →true
    }

    private static boolean no14(int[] input) {

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 && input[input.length - 1] == 4) {
                return false;
            }
        }
        return true;
    }


    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) {
                return false;
            }

        }
        return true;
    }

    public static void printArrayForEach(int[] array) {
        for (int elementik : array) {
            System.out.print(elementik + ", ");
        }
        System.out.println();

    }
}
