package e4p2;

import java.io.*;

public class T0Princess {
    public static void main(String[] args) throws Exception {
        int[] array = initArr();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initArr() throws IOException {
        // создайте и заполните массив
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//        String name = bufferedReader.readLine();

        return new int[]{26, 88, 48, 41, 58, 82, 99, 81, 76, 12, 59, 98, 120};
    }

    public static int max(int[] array) {
        // найдите максимальное значение
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;

        /* or sort array and return last index
        Arrays.sort(array);
        return array[array.length - 1];
         */
    }
}