package e3p1;

import java.util.Scanner;

public class T2DarkSidePower {
    public static void main(String[] args) {
        int check;

        Scanner input = new Scanner(System.in);

        System.out.println("For exit press 5:\n");

        do {
            check = input.nextInt();

            if (check == 0) {
                System.out.println("it’s balance");
            } else if (check > 0) {
                System.out.println("it’s Light side");
            } else {
                System.out.println("it’s Dark side");
            }
        } while (check != 5);
    }
}
