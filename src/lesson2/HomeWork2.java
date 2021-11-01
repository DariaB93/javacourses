package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
//       вывести на консоль цифры в диапозоне от 20 до 0
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        }
//        вывести на консоль нечетные цифры в диапозоне от -20 до 20
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
//        вывести на консоль цифры в диапозоне от 10 до 40 с пропуском от 15 до 20
        for (int i = 10; i <= 40; i++) {
            if (i < 16 || i > 19) {
                System.out.println(i);
            }
        }
//        вывести на консоль четные цифры в диапозоне от 10 до 50
        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
