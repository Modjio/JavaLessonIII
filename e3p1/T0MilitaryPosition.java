package e3p1;

import java.util.Scanner;

public class T0MilitaryPosition {
    public static void main(String[] args) {
        String name1, name2;

        Scanner input = new Scanner(System.in);

        name1 = input.next();
        name2 = input.next();

        if (name1.equals("Anakin") ^ name2.equals("Anakin") && name2.equals("Obi-Wan") ^ name1.equals("Obi-Wan")) {
            System.out.println(name1 + " and " + name2 + " - friends");
        } else if (name1.equals("Anakin") || name1.equals("Obi-Wan")) {
            System.out.println(name1 + " - friend. " + name2 + " - foe");
        } else if (name2.equals("Obi-Wan") || name2.equals("Anakin")) {
            System.out.println(name2 + " - friend. " + name1 + " - foe");
        } else {
            System.out.println(name1 + " and " + name2 + " - foes");
        }
    }
}
