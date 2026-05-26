import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int value:arr){
            if(value<min){
                min=value;
            }
        }
        System.out.println("minimum = " + min);
    }
    
}
