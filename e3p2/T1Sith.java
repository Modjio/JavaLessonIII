package e3p2;

public class T1Sith {
    public static void main(String[] args) {
        Sith user = new Sith("Sirius", 110);

        System.out.println(user.getName());
        System.out.println(user.getAge());
        user.setAge(115);
        System.out.println(user.getAge());
    }
}

class Sith {
    private String name;
    private int age;

    public Sith(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
