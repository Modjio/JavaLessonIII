package e3p2;

public class T2Order66 {
    public static void main(String[] args) {
        Jedi user1 = new Jedi("Anakin", 20, "Human", 180);
        Jedi user2 = new Jedi("Obi-Wan", 45, "Human", 178);
        Jedi user3 = new Jedi("Yoda", 345, "Lemming", 45);
    }

    public static class Jedi {
        private String name;
        private int age;
        private String race;
        private double height;

        public Jedi(String name, int age, String race, double height) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.height = height;
        }
    }
}

