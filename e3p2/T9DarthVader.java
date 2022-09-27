package e3p2;

public class T9DarthVader {
    public static void main(String[] args) {
        //напишите тут ваш код
        Jedi jedi1 = new Jedi("Ken", 450);
        Jedi jedi2 = new Jedi("Barby", 555, 18, "Beauty");
        Jedi jedi3 = new Jedi("Artem", 12000, "Earth");
        Jedi jedi4 = new Jedi("Kostya", 1000, 36);

        jedi4.setSideForce("Dark");
        System.out.println(jedi1.name + " " + jedi1.sideForce);
        System.out.println(jedi2.name + " " + jedi2.sideForce);
        System.out.println(jedi3.name + " " + jedi3.sideForce);
        System.out.println(jedi4.name + " " + jedi4.sideForce);

    }

    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        String sideForce = "Light";
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

        Jedi(String name, int midichlorians, int age, String species, String sideForce) {
            this.name = name;
            this.midichlorians = midichlorians;
            this.age = age;
            this.species = species;
            this.sideForce = sideForce;
        }

        private void setSideForce(String sideForce) {
            this.sideForce = sideForce;
        }
    }
}
