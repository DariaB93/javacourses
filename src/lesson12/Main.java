package lesson12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> text = new ArrayList<>();
        text.add(5);
        text.add(58);
        text.add(565);
        text.add(545);
        text.add(45);
        text.set(0,7);

        System.out.println(text);
    }
}
