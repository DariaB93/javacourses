package lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10,2.3,"золото",1900);
        Coin coin2 = new Coin(10,2.3,"золото",1900);
        Coin coin3 = new Coin(20,2.8,"cеребро",1500);
        Coin coin4 = new Coin(15,4.3,"бронза",1850);
        Coin coin5 = new Coin(18,1.5,"золото",2000);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c:coins){
            System.out.println(c);

        }
    }
}
