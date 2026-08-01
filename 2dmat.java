public class Main {
    public static void main(String[] args) {

        // Matrix A (2 x 3)
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Matrix B (3 x 2)
        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Result Matrix (2 x 2)
        int[][] C = new int[2][2];

        // Matrix Multiplication
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print Result Matrix
        System.out.println("Result Matrix:");

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
