package PR2.tut10;

import java.io.*;
import java.util.Arrays;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int n, int m) {
        this.rows = n;
        this.columns = m;
        this.data = new double[n][m];
    }

    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (double[] row : data) {
                writer.println(Arrays.toString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Matrix read(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int rowCount = 0;
            int columnCount = -1;
            while ((line = reader.readLine()) != null) {
                rowCount++;
                String[] values = line.substring(1, line.length() - 1).split(", ");
                if (columnCount == -1) {
                    columnCount = values.length;
                } else if (columnCount != values.length) {
                    throw new IllegalArgumentException("Inconsistent number of columns in the matrix file");
                }
            }
            Matrix matrix = new Matrix(rowCount, columnCount);
            reader.close();

//            reader = new BufferedReader(new FileReader(filename));
            rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.substring(1, line.length() - 1).split(", ");
                for (int j = 0; j < columnCount; j++) {
                    matrix.data[rowCount][j] = Double.parseDouble(values[j]);
                }
                rowCount++;
            }
            return matrix;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Matrix sum(Matrix m) {
        if (this.rows != m.rows || this.columns != m.columns) {
            return null; // Matrices have different dimensions
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return result;
    }

    public Matrix product(Matrix m) {
        if (this.columns != m.rows) {
            return null; // Matrices have incompatible dimensions
        }
        Matrix result = new Matrix(this.rows, m.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.columns; j++) {
                double sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.data[i][k] * m.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public void print() {
        for (double[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.save("matrix1.txt");
        matrix1.print();

        Matrix matrix2 = Matrix.read("matrix1.txt");

        matrix2.print();

        Matrix sumMatrix = matrix1.sum(matrix2);
        if (sumMatrix != null) {
            System.out.println("Sum:");
            sumMatrix.print();
        } else {
            System.out.println("Matrices have different dimensions.");
        }

        Matrix productMatrix = matrix1.product(matrix2);
        if (productMatrix != null) {
            System.out.println("Product:");
            productMatrix.print();
        } else {
            System.out.println("Matrices have incompatible dimensions.");
        }
    }
}
