package e3p1;

import java.util.Scanner;

public class T1PalpatinSearch {
    public static void main(String[] args) throws Exception {
        String check;

        Scanner input = new Scanner(System.in);
        System.out.println("For exit press 0:\n");

        do {
            check = input.next();

            if (check.equals("1")) {
                System.out.println("Duku is here");
            }
            if (check.equals("2")) {
                System.out.println("It’s a trap");
            }
        } while (!check.equals("0"));
    }
}
