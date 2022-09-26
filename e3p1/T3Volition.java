package e3p1;

import java.util.Scanner;

public class T3Volition {
    public static void main(String[] args) {
        int check;

        Scanner input = new Scanner(System.in);

        System.out.println("For exit press 5");

        do {
            check = input.nextInt();

            if (check == 0) {
                System.out.println("balance");
            }
            if (check > 0) {
                if (check % 2 == 0) {
                    System.out.println("compassion");
                } else {
                    System.out.println("mercy");
                }
            }
            if (check < 0) {
                if (check % 2 == 0) {
                    System.out.println("pain");
                } else {
                    System.out.println("anger");
                }
            }
        } while (check != 5);
    }
}
