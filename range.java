import java.util.Scanner;

public class RangeSumQuery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10};

        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int left = 1;
        int right = 3;

        int sum;

        if (left == 0)
            sum = prefix[right];
        else
            sum = prefix[right] - prefix[left - 1];

        System.out.println("Range Sum = " + sum);
    }
}
