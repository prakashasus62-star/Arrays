public class Main {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = arr.length;

        // Transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // Reverse every row
        for(int i=0;i<n;i++){

            int left=0,right=n-1;

            while(left<right){

                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }
        }

        for(int[] row:arr){
            for(int x:row)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
