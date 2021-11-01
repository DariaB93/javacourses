package lesson14;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExemple {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);

        linkedHashMap.put(5,"f");
        linkedHashMap.put(4,"f");
        linkedHashMap.put(3,"f");
        linkedHashMap.put(6,"f");
        linkedHashMap.put(1,"f");
        linkedHashMap.put(2,"f");
        System.out.println(linkedHashMap);
        linkedHashMap.get(6);
        System.out.println(linkedHashMap);

    }
}
