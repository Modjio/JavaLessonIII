package e2p1;

public class T3Zam {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zam zam = new Zam();
        Dron dron = new Dron();

        zam.spy = dron;
        dron.hunter = zam;

    }

    public static class Zam {
        //напишите тут ваш код
        String name;
        int age;
        Dron spy;
    }

    public static class Dron {
        //напишите тут ваш код
        String name;
        int age;
        Zam hunter;
    }
}
