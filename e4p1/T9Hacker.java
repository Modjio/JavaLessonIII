package e4p1;

import java.util.Scanner;
import java.util.Arrays;

public class T9Hacker {
    public static byte[] array = new byte[5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введи 5 чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextByte();
        }

        sortArray(array);
        System.out.println();
        printOut(array);


        for (byte b : array) {

        }
        for (int i = 0; i < array.length; i++) {

        }
        for (int i = array.length - 1; i >= 0; i--) {

        }

    }

    // method sort array
    public static void sortArray(byte[] array) {
        Arrays.sort(array);
    }

    // method print out
    public static void printOut(byte[] array) {
        for (byte b : array) {
            System.out.println(b);
        }
    }
}
