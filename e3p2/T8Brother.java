package e3p2;

public class T8Brother {
    public static void main(String[] args) {
        //напишите тут ваш код
        Jedi jedi1 = new Jedi("Ken", 450);
        Jedi jedi2 = new Jedi("Barby", 555, 18, "Beauty");
        Jedi jedi3 = new Jedi("Artem", 12000, "Earth");
        Jedi jedi4 = new Jedi("Kostya", 1000, 36);


    }
    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        //напишите тут ваш код

        Jedi(String name, int midichlorians) {
            this.name = name;
            this.midichlorians = midichlorians;
        }
        Jedi(String name, int midichlorians, int age) {
            this.name = name;
            this.midichlorians = midichlorians;
            this.age = age;
        }
        Jedi(String name, int midichlorians, String homeworld) {
            this.name = name;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
        }
        Jedi(String name, int midichlorians, int age, String species) {
            this.name = name;
            this.midichlorians = midichlorians;
            this.age = age;
            this.species = species;
        }
    }
}
