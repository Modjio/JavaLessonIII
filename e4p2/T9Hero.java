package e4p2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class T9Hero {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
