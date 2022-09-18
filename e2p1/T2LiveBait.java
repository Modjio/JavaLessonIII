package e2p1;

public class T2LiveBait {
    public static void main(String[] args) {
        increaseSpeed(700);
    }

    public static void increaseSpeed(int a) {
        int speed = 0;
        while (speed <= a) {
            System.out.println("Your speed is: " + speed + " km/h.");
            speed += 100;
        }
    }
}
