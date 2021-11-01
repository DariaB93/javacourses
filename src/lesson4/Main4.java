package lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "i love my cat";
        int countGlass = 0;
        for (char ch :text.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'y' ){
                countGlass++;
            }
        }
        char[] glassnie = new char[countGlass];
        int indexGlassnih = 0;
        for (char ch :text.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'y' ){
                glassnie[indexGlassnih] = ch;
                indexGlassnih++;
            }
        }
        System.out.println();
    }
}
