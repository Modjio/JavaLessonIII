package e2p2;

import java.util.Scanner;

public class T6Army {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        count -= 20;
        System.out.println("Dead is " + count + " jedis");
    }
}
