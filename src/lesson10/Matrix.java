package lesson10;

public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void getRows() {
        int rows = matrix.length;
        System.out.println("Number of rows: " + rows);
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i]);
        }
        System.out.println(" ");
    }

    @Override
    public void getColumns() {
        int cols = matrix[0].length;
        System.out.println("Number of cols: " + cols);
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[j]);
        }
        System.out.println(" ");
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return 0;
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        boolean full = true;
        for (int i = 0; i < matrix.length && !full; i++) {
            for (int j = 0; j < matrix[i].length && !full; j++) {
                if (matrix[i][j] == ' ') {
                    full = false;
                }
            }
        }
        return full;
    }


    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}
