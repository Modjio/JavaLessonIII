package e4p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T8Error {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;
        System.out.println(str + max);
    }
}
