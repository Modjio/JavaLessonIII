package e4p1;

public class T4Alderaan {
    private static int cloneCount = 0;

    public void CloneTroopers() {
        cloneCount++;
    }

    public static int getCloneCount() {
        //напишите тут ваш код
        return T4Alderaan.cloneCount;
    }

    public static void setCloneCount(int cloneCount) {
        //напишите тут ваш код
        T4Alderaan.cloneCount = cloneCount;
    }

    public static void main(String[] args) {
    }
}
