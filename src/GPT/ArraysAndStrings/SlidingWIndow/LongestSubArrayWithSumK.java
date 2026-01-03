package GPT.ArraysAndStrings.SlidingWIndow;

public class LongestSubArrayWithSumK {

    public static void main(String[] args){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        int left = 0, sum =0, max_length = 0;
        for(int right=0; right < arr.length; right++){
            sum += arr[right];

            while(sum > k){
                sum-=arr[left];
                left++;
            }
            max_length = Math.max(max_length,right-left+1);
        }
        System.out.println(max_length);
    }
}
