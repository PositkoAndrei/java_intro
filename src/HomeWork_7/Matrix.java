package HomeWork_7;

public class Matrix {
    public static void main(String[] args) {
        int [][] matrixA = {{9, -6}, {6, -4}};
        int [][] matrixB = {{2, -3}, {4, -6}};
        int [][] result = new int [matrixA.length] [matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                for (int k = 0; k < matrixB.length; k++)
                    result [i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
