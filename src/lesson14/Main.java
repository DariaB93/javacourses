package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        HashMap работает по принципу хеширование, хеширование в Java это преобразование
//        объекта в с помощью метода hashcode в число int
//        в основа HashMap лежит масив , элементами которого является двусвязынй список LinkedList
//        все что мы добавляем в HashMap принимает двусвязынй список LinkedList
//        NODE - узел
//        ключ должен быть уникальным
//        если ключ будет null ,то он кладет его в первую ячейку в нулевую
//        если hashcode совподает, то это называется коллизия - это очень редкий случай
//        если у обьекта совподает ключ, а соответсвенно и hashcode , тогда он кладется поверх и меняется только значение

        Map<String, Double> map = new HashMap<>();
        map.put("Vlad", 4.5);
        System.out.println(map);
//        map.put(null, 5.5);
        map.put("Vlad", 8.7);
        System.out.println(map);

    }
}
