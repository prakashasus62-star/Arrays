public class lar{
    public static void main(String[] args){
        int arr[]={9,8,7};
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];

            }
            else if(arr[i]>seclar && arr[i]!=lar){
                seclar=arr[i];

            }
        }
        System.out.println(lar);
        System.out.println(seclar);
    }

}