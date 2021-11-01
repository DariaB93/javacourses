package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - квадрат");
        System.out.println("4 - треугольник");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        int inputFigura = scanner.nextInt();
        System.out.println("Что посчитать?");
        System.out.println("1 - площадь");
        System.out.println("2 - периметр");
        int inputAction = scanner.nextInt();

        switch (inputFigura) {
            case 1:
                System.out.println("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                double area = Math.PI * (radius * radius);
                if (inputAction == 1) {
                    System.out.println("Площадь круга = " + area);
                } else {
                    System.out.println("Периметр круга = " + (2 * radius * Math.PI));
                }
                break;
            case 2:
                System.out.println("Введите длинну большой полуоси: ");
                double bigSemiaxis = scanner.nextDouble();
                System.out.println("Введите длинну маленькой полуоси: ");
                double smallSemiaxis = scanner.nextDouble();
                if (inputAction == 1) {
                    System.out.println("Площадь овала = " + (bigSemiaxis * smallSemiaxis * Math.PI));
                } else {
                    System.out.println("Периметр овала = " + 4 * (Math.PI * bigSemiaxis * smallSemiaxis + (bigSemiaxis - smallSemiaxis) * (bigSemiaxis - smallSemiaxis)) / (bigSemiaxis + smallSemiaxis));
                }
                break;
            case 3:
                System.out.println("Введите сторону квадрата: ");
                int inputSide = scanner.nextInt();
                if (inputAction == 1) {
                    System.out.println("Площадь квадрата = " + (inputSide * inputSide));
                } else {
                    System.out.println("Периметр квадрата = " + (4 * inputSide));
                }
                break;
            case 4:
                System.out.println("Введите первую сторону треугольника: ");
                double firsSide = scanner.nextDouble();
                System.out.println("Введите вторую сторону треугольника: ");
                double secondSide = scanner.nextDouble();
                System.out.println("Введите третью сторону треугольника: ");
                double thirdSide = scanner.nextDouble();
                double areaTriangle = (firsSide + secondSide + thirdSide) / 2;
                if (inputAction == 1) {
                    System.out.println("Площадь треугольника = " + Math.sqrt(areaTriangle * (areaTriangle - firsSide) * (areaTriangle - secondSide) * (areaTriangle - thirdSide)));
                } else {
                    System.out.println("Периметр треугольника = " + (firsSide + secondSide + thirdSide));
                }
                break;
            case 5:
                System.out.println("Введите длинну первого основания : ");
                double firsBase = scanner.nextDouble();
                System.out.println("Ввидети длинну второго основания : ");
                double secondBase = scanner.nextDouble();
                System.out.println("Введите высоту: ");
                double height = scanner.nextDouble();
                if (inputAction == 1) {
                    System.out.println("Площадь трапеции = " + ((firsBase + secondBase) * (height) / 2));
                } else {
                    System.out.println("Введите второю высоту стороны");
                    double secondHeight = scanner.nextDouble();
                    System.out.println("Периметр трапеции = " + (firsBase + secondBase + height + secondHeight));
                }
                break;
            default:
                System.out.println("Извините, в нашей программе такой фигуры нет");
        }
    }
}
