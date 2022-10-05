package e4p1;

public class T1Ley {
    public static void main(String[] args) {

    }

    //напишите тут ваш код
    protected void finalize() {
        System.out.println("A Jedi was destroyed");
    }
    //
}

class Sith {
    //напишите тут ваш код
    protected void finalize() {
        System.out.println("A Sith was destroyed");
    }
    //
}
