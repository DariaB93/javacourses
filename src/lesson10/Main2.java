package lesson10;

public class Main2 {
    public static void main(String[] args) {
        double[][] v = {{1, 3, 5, 3, 4}, {1, 2, 4, 6, 7}, {2, 4, 5, 9, 7}};
        Matrix matrix1 = new Matrix(v);

        double[][] v2 = {{-1, 5, 7, 8, 7}, {5, 5, 7, 7, 7}, {2, 4, 5, 3, 7}};
        Matrix matrix2 = new Matrix(v2);

        IMatrix addResult = matrix1.add(matrix2);

    }
}
