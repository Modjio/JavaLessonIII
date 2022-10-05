package e4p1;

import java.util.Scanner;

/*
Класс ConsoleReader
*/

public class T5Smuggler {

    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        return i;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        return d;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);
        boolean b = input.nextBoolean();
        return b;
    }

    public static void main(String[] args) throws Exception {

    }
}
