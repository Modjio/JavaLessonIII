package e3p2;

public class T4Betrayal {
    public static void main(String[] args) {
        Jedi jedi = new Jedi("Ken", 18, 350);

        jedi.setName("Ken1");

        System.out.print(jedi.name + " " + jedi.age + " " + jedi.midichlorians);
    }

    static class Jedi {
        String name;
        int age;
        int midichlorians;

        Jedi(String name, int age, int midichlorians) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }

        private void setName(String name) {
            this.name = name;
        }
    }
}
