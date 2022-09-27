package e3p2;

public class T6FGE {

    static class Tunnel {
        int centerX, centerY, radius, width;

        Tunnel(int centerX, int centerY) {
            this.centerX = centerX;
            this.centerY = centerY;
        }

        Tunnel(int centerY, int centerX, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        Tunnel(int centerX, int centerY, int radius, int width) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
    }

    public static void main(String[] args) {

    }
}
