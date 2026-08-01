import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {9, 4, 7},
                {2, 8, 1},
                {6, 5, 3}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Convert 2D matrix to 1D array
        int[] arr = new int[rows * cols];
        int index = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                arr[index++] = value;
            }
        }

        // Sort the 1D array
        Arrays.sort(arr);

        // Copy back to 2D matrix
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = arr[index++];
            }
        }

        System.out.println("Sorted Matrix:");

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
