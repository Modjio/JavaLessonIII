package e2p1;

public class T4FirstTask {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi();
        jedi1.name = "Obi-Wan";
        Jedi jedi2 = new Jedi();
        jedi2.name = "Anakin";
        Jedi jedi3 = new Jedi();
        jedi3.name = "Joda";
    }

    public static class Jedi {
        public String name;
    }
}
