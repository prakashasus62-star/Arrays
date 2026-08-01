public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {4, 7, 2},
            {9, 1, 5},
            {3, 8, 6}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest element = " + max);
    }
}
