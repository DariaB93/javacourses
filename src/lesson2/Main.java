package lesson2;

public class Main {
    public static void main(String[] args) {

        // управляющие конструкции

        int a = 9;
        int b = 7;
        int c = 8;

        // операторы которые дают ответ Да или Нет (TRUE FALCE)
        // > >=  < <=  ==  !=
        // && обьеденения выражение   || или то или то
        //операторы которые дают математический ответ   +  -  *  /  %(остаток от деления)

        if (a == b && b == c) {
            System.out.println("равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("разносторонний треугольник");
        } else {
            System.out.println("равнобедренный треугольник");
        }
    }
}
