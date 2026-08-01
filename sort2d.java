public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {9, 4, 7},
                {2, 8, 1},
                {6, 5, 3}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Sort matrix elements
        for (int i = 0; i < rows * cols - 1; i++) {
            for (int j = i + 1; j < rows * cols; j++) {

                int r1 = i / cols;
                int c1 = i % cols;

                int r2 = j / cols;
                int c2 = j % cols;

                if (matrix[r1][c1] > matrix[r2][c2]) {
                    int temp = matrix[r1][c1];
                    matrix[r1][c1] = matrix[r2][c2];
                    matrix[r2][c2] = temp;
                }
            }
        }

        System.out.println("Sorted Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
