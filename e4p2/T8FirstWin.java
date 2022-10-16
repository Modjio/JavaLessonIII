package e4p2;

public class T8FirstWin {
    public static void main(String[] args) {
        // напишите тут ваш код
        Jedi jedi1 = new Jedi("Jenx", false, 19);
        Jedi jedi2 = new Jedi("Ken", true, 34, jedi1.name);
        Jedi jedi3 = new Jedi("Anakin", true, 17, jedi2.name);


        System.out.println(jedi1);
        System.out.println(jedi2);
        System.out.println(jedi3);
    }

    public static class Jedi {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        String teacher;

        Jedi(String name, boolean sex, int age, String teacher) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.teacher = teacher;
        }

        Jedi(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.teacher != null) {
                text += ", учитель: " + this.teacher;
            }
            return text;
        }
    }
}
