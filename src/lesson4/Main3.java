package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String source = "Алгоритмы+Данные=Программы";
        // String source = "Алгоритмы=Программы-Данные";
        // Определяем позицию символа '+‘
        int p1 = source.indexOf('+');
        // Определяем позицию символа '=‘
        int p2 = source.indexOf('=');
        // Вырезаем первое слово
        String alg = source.substring(0, p1);
        // Вырезаем второе слово
        String dat = source.substring(p1 + 1, p2);
        // Вырезаем третье слово
        String prg = source.substring(p2 + 1);
        // Сшиваем все по-новому
        String target = alg + "=" + prg + "-" + dat;
        System.out.println(source);
        System.out.println(target);
    }
}
