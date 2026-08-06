import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 8, 0, 2};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
