package lesson14;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        String value = "космос, вселенная, космос, вселенная, космос";
        String sign[] = value.split(", ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String t : sign) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}


