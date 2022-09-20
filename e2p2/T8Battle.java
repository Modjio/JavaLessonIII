package e2p2;

public class T8Battle {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(322));
    }
    public static int sumDigitsInNumber(int number) {
        int n1, n2, n3;

        n3 = number % 10;
        n2 = number / 10 % 10;
        n1 = number / 100 % 10;

        return n3 + n2 + n1;
    }
}
