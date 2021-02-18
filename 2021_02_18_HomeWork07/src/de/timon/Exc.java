package de.timon;

public class Exc {
    public static void main(String[] args) {

        int[] arr1 = new int[]{6, 2, 5, 3};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = new int[]{1};
        printArrayForEach(shiftLeft(arr1)); // → [2, 5, 3, 6]
        printArrayForEach(shiftLeft(arr2));// → [2, 1]
        printArrayForEach(shiftLeft(arr3)); // → [1]
    }

    private static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        output[output.length - 1] = input[0];

        return output;

    }

    public static void printArrayForEach(int[] array) {
        for (int elementik : array) {
            System.out.print(elementik + ", ");
        }
        System.out.println();

    }

}
