package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 4, 14, 57, 25, 98, 478};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
