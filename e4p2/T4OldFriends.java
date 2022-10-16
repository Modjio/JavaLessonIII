package e4p2;

import java.util.ArrayList;
import java.util.Scanner;


public class T4OldFriends {
    public static void main(String[] args) {
        int min;
        ArrayList<String> people = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            people.add(input.nextLine());
        }

        // find short string
        min = people.get(0).length();
        for (int i = 1; i < people.size(); i++) {
            if (min > people.get(i).length()) {
                min = people.get(i).length();
            }
        }

        // print all min
        for (String person : people) {
            if (min == person.length())
                System.out.println(person);
        }
    }
}
