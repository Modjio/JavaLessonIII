package e3p1;

public class T8CatchGrivus {
    public static void main(String[] args) {
        int x = 1, y = 1;

        while (y != 10) {
            while (x != 10) {
                System.out.print(x * y + "\t");
                x++;
            }
            System.out.println();
            x = 1;
            y++;
        }
    }
}
