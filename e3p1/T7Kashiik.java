package e3p1;

import java.util.Scanner;

public class T7Kashiik {
    public static void main(String[] args) {
        int m, n;

        Scanner input = new Scanner(System.in);

        System.out.print("Input m & n numbers: ");
        n = input.nextInt();
        m = input.nextInt();

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
