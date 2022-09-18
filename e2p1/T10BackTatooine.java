package e2p1;

public class T10BackTatooine {
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(max(-20, -10));
        System.out.println(max(-40, -10, -30, 40));
        System.out.println(max(-20, -40, -30, 40));
        System.out.println(max(-20, -10, -40, 40));
        System.out.println(max(-20, -10, -30, -40));
    }
}
