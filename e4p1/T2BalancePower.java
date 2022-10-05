package e4p1;

public class T2BalancePower {
    public static int theForce = 0;

    //напишите тут ваш код
    public void Force() {
        this.theForce++;
    }

    protected void finalize() throws Throwable {
        this.theForce--;
    }

    //
    public static void main(String[] args) {
    }
}
