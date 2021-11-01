package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> strings = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        strings.add(8);
        strings.add(4);
        strings.add(5);
        strings.add(6);

        System.out.println(strings);
    }
}
