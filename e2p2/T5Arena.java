package e2p2;

import java.util.Scanner;

public class T5Arena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int count = input.nextInt();

        System.out.println("Master " + name + " is here with " + count + " jedis");
    }
}
