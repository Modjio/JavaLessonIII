package e3p2;

public class T7Mustafar {
    static class Enemy {
        String name;
        int count;

        public static void main(String[] args) {
            Enemy enemy = new Enemy();
            System.out.println("Enemy name: \"" + enemy.name + "\"\nCount of midichlorians: " + enemy.count);
        }

        //напишите тут ваш код
        Enemy(String name, int count) {
            this.name = name;
            this.count = count;
        }
        //

        Enemy(int i) {
            this("Anakin Skywalker", i);
        }

        Enemy() {
            this(20000);
        }
    }
}
