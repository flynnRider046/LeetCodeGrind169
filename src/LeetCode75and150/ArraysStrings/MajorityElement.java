package LeetCode75and150.ArraysStrings;

import java.util.HashMap;

public class MajorityElement {

    static void findingMajorityElement(int[] arr){
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            hash1.put(arr[i],hash1.getOrDefault(arr[i],0)+1);
        }
        int max_value = Integer.MIN_VALUE;
        for(int a : hash1.keySet()){
            max_value = Math.max(max_value,hash1.get(a));
        }

        for(int b : hash1.keySet()){
            if(max_value == hash1.get(b)){
                System.out.println("The value is: "+ b);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] nums1 = {2,2,1,1,1,2};
        findingMajorityElement(nums);
        findingMajorityElement(nums1);
    }
}
