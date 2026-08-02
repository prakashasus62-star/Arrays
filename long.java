import java.util.HashSet;

public class LongestConsecutive {

    public static int longest(int[] nums){

        HashSet<Integer> set=new HashSet<>();

        for(int x:nums)
            set.add(x);

        int longest=0;

        for(int x:set){

            if(!set.contains(x-1)){

                int current=x;
                int count=1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }

                longest=Math.max(longest,count);
            }
        }

        return longest;
    }

    public static void main(String[] args){

        int arr={100,4,200,1,3,2};

        System.out.println(longest(arr));
    }
}
