public class CircularSubarray {

    static int kadane(int[] arr) {
        int max = arr[0], sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static int maxCircular(int[] arr) {

        int normal = kadane(arr);

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            arr[i] = -arr[i];
        }

        int circular = total + kadane(arr);

        if (circular == 0)
            return normal;

        return Math.max(normal, circular);
    }

    public static void main(String[] args) {
        int[] arr = {5,-3,5};
        System.out.println(maxCircular(arr));
    }
}
