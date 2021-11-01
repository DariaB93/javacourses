package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        double a = 12;
        double b = 4;
        double c = 9;

        double p = a + b + c;
        double pp = p / 2;
        double ploshadi = pp * (pp-a) * (pp - b) * (pp -c);
        System.out.println(Math.sqrt(ploshadi));

    }
}
