package e4p2;

import java.util.ArrayList;

public class T6Weak {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("darth");
        strings.add("veider");
        strings.add("skywalker");
        strings.add("jedi");
        strings = Arraylist(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    // del "d"
    // double "s"
    // nothing "d" & "j"

    public static ArrayList<String> Arraylist(ArrayList<String> strings) {
        //напишите тут ваш код
        int size = strings.size();
        for (int i = 0; i < size; i++){
            if (!strings.get(i).contains("d") && strings.get(i).contains("s"))
                strings.add(strings.get(i));
            else if (strings.get(i).contains("d") && !strings.get(i).contains("j")){
                strings.remove(i--);
                size--;
            }
        }
        return strings;
    }
}
