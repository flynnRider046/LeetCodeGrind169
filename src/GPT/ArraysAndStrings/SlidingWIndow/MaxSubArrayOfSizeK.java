package GPT.ArraysAndStrings.SlidingWIndow;

public class MaxSubArrayOfSizeK {

    public static void main(String[] args){
        int[] arr1 = {2,1,5,1,3,2};
        int sum = 0, left = 0, k = 3, max_sum = 0;
        for(int right=0; right < arr1.length; right++){
            sum += arr1[right];

            if(right - left + 1 == k){
                max_sum = Math.max(max_sum,sum);
                sum -= arr1[left];
                left++;
            }
        }
        System.out.println(max_sum);
    }
}
