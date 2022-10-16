package e4p2;

//import java.io.BufferedReader;

import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;

public class T7Red5 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> team = new ArrayList<>();
        // добавим в список ряд элементов с помощью метода add()
        team.add("dron");
        team.add("galaxy");
        team.add("jedi");
        team.add("wars");
        team.add("star");
        team.add("yoda");
        team.add("master");
        team.add("luke");
        team.add("force");
        team.add("sith");

        for (int i = 0; i < team.size() - 1; i++) {
            if (team.get(i).length() > team.get(i + 1).length()) {
                System.out.println(i + 2);
                break;
            }
        }
    }
}