package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String text = "i want to eat something sweet";
       String[] words =  text.split(" ");
       for (int i = words.length -1 ; i >= 0; i--){
           System.out.println(words[i]);
       }
    }
}
