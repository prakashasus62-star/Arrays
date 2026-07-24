import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {

        Integer[] arr = {5, 2, 8, 1, 9};

        Arrays.sort(arr, Collections.reverseOrder());

        for (int num : arr)
            System.out.print(num + " ");
    }
}
