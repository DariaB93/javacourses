package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String text = "kosmos is very big";
        for(int i = text.length() - 1; i >= 0; i--){
           char ch =  text.charAt(i);
            System.out.print(ch);
        }
    }
}
