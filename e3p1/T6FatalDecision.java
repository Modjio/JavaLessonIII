package e3p1;

import java.util.Scanner;

public class T6FatalDecision {
    public static void main(String[] args) {
        String str = "";
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("For exit write exit");

        while (!str.equals("exit")) {
            str = input.nextLine();

            if (str.equals("I’m not a traitor")) {
                count++;
                System.out.println("Traitor count - " + count);
            }
        }
    }
}
