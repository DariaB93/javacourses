package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "flowers are beautiful";
        text = text.replace('e', '!');
        text = text.replace('a','!');
        text = text.replace('o','!');
        text = text.replace('i','!');
        text = text.replace('u','!');
        System.out.println(text);

    }
}
