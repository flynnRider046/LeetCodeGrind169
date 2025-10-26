package Week1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int result = target - nums[i];
            if(hashMap.containsKey(result)){
                return new int[]{hashMap.get(result),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));

    }


}
