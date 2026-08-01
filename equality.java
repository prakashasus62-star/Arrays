public class Main {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {1, 2},
                {3, 4}
        };

        boolean equal = true;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }
}
