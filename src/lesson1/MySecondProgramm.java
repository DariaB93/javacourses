package lesson1;
public class MySecondProgramm {
    public static void main(String[] args) {
        double tableLenght = 2.5;
        double tableWight = 1.5;
        double roomLenght = 5;
        double roomWight = 7;

        double sqTable = tableLenght * tableWight;
        double sqRoom = roomLenght * roomWight;
        int countTable = (int)(sqRoom / sqTable);

        System.out.println(countTable);
    }
}
