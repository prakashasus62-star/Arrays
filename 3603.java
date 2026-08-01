public class Main {

    public static void main(String[] args) {

        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n=arr.length;

        for(int j=n-1;j>=0;j--){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
