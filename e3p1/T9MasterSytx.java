package e3p1;

import java.util.Scanner;

public class T9MasterSytx {
    public static void main(String[] args) {
        int number, count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("For exit press 0");

        do {
            number = input.nextInt();

            if (number > 0) {
                count++;
            } if (number < 0) {
                count--;
            }
        } while (number != 0);

        if (count == 0) {
            System.out.println("Feel the power of balance");
        } else if (count > 0) {
            while (count != 0) {
                System.out.println("Feel the power of Light Side");
                count--;
            }
        } else {
            while (Math.abs(count) != 0) {
                System.out.println("Feel the power of Dark Side");
                count++;
            }
        }
    }
}

