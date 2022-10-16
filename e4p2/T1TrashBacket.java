package e4p2;

import java.util.Arrays;

public class T1TrashBacket {
    public static String[] strArray = inputStrArray();
    public static int[] intArray = inputIntArray();

    public static void main(String[] args) {
        fillCount(strArray);

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(intArray));
    }

    public static String[] inputStrArray() {

        return new String[]{"dron", "galaxy", "jedi", "wars", "star", "yoda", "master", "luke", "force", "sith"};
    }

    public static int[] inputIntArray() {

        return new int[10];
    }

    public static void fillCount(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = strArray[i].length();
        }
    }
}
