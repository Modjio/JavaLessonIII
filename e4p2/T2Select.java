package e4p2;

import java.util.Arrays;

public class T2Select {
    public static int[] intArray = inputIntArray(20);
    public static int[] intArrayA = inputIntArray(10);
    public static int[] intArrayB = inputIntArray(10);

    public static void main(String[] args) {
        intArray = new int[]{310, 971, 511, 619, 813, 747, 688, 56, 390, 180, 930, 631, 108, 816, 217, 166, 229, 304, 381, 542};
        copyArray(intArray);
//        outputArray(intArrayA);
        outputArray(intArrayB);
    }

    public static int[] inputIntArray(int a) {
        return new int[a];
    }

    public static void copyArray(int[] array) {
        intArrayA = Arrays.copyOf(array, array.length/2);
        intArrayB = Arrays.copyOfRange(array, array.length/2, array.length);
    }

    public static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
