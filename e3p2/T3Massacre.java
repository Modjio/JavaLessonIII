package e3p2;

public class T3Massacre {
    public static void main(String[] args) {

    }

    static class Jedi {
        String name;
        int count;
        String weapon;

        private void initialize(String name) {
            this.name = name;
        }

        private void initialize(String name, int count) {
            this.name = name;
            this.count = count;

        }

        private void initialize(String name, int count, String weapon) {
            this.name = name;
            this.count = count;
            this.weapon = weapon;
        }
    }
}


