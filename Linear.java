import java.util.Scanner;
public class Linear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searche");
        int key=sc.nextInt();
        int find=0;
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                find=1;
                System.out.println("Element found at index: "+arr[i]);
                break;
            }
        }
        if(find==0){
            System.out.println("Element not found");
        }

    }
    
}
// linear serach na key is given after thT one by one compare after that is key find or not the output was deleiverd;