package e4p2;

import java.util.ArrayList;

public class T3ArrList {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        // добавим в список ряд элементов с помощью метода add()
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add("Bob");

        System.out.printf("ArrayList has %s elements \n", people.size());
        for (String s : people) {
            System.out.println(s);
        }
    }
}
