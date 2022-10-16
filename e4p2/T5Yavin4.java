package e4p2;

import java.util.ArrayList;
import java.util.Scanner;

public class T5Yavin4 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            people.add(input.nextLine());
        }

        // 13 times del last string and insert begin
        for (int i = 0; i < 13; i++) {
            people.add(0, people.get(people.size() - 1));
            people.remove(people.size() - 1);

            /* or in one line
            people.add(0, people.remove(people.size() - 1));
             */
        }

        // output list
        for (String person : people) {
            System.out.println(person);
        }
    }
}
