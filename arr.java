import java.util.*;
public class arr{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int lar=0;
        int secondlar=0;

        for(int i=0; i<n; i++){
            if(arr[i]>lar){
                secondlar=lar;
                lar=arr[i];
            }
            else if(arr[i]>secondlar && arr[i]!=lar){
                secondlar=arr[i];
            }

        }
        System.out.println("Largest element: " + lar);
        System.out.println("Second largest element: " + secondlar);
    }
}