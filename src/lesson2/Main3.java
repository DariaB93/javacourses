package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int mark = 2;

        switch (mark) {
            case 5:
                System.out.println("отлично");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 3:
                System.out.println("не очень");
                break;
            case 2:
                System.out.println("плохо");
                break;
            default:
                System.out.println("это не оценка");
        }
    }
}
