package lesson3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для хранения: ");
        double unputMoney = scanner.nextDouble();

        System.out.println("Введите годовой % : ");
        double unputProcent = scanner.nextDouble();

        System.out.println("На сколько лет хотите оставить: ");
        int unputYear = scanner.nextInt();

        for (int i = 0; i < unputYear; i++) {
            for (int month = 0; month < 12; month++) {
                unputMoney = unputMoney + (unputMoney / 100 * (unputProcent / 12));
            }
        }
        System.out.println("По истечении" + unputYear + "лет у нас будет: " + (int) unputMoney);
    }
}
