package TopKElements;

import java.util.PriorityQueue;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums){
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        for(int i : nums){
            //This step is to make sure that queue contains only the distinct elements from the array
            if(!qu.contains(i)){
                qu.add(i);
            }

            if(qu.size() > 3){
                qu.poll();
            }
        }
        Integer largestEle = null;
        if(qu.size() < 3){
            largestEle = qu.peek();
            for(int n : qu){
                if(n > largestEle) {
                    largestEle = n;
                }
            }
            return largestEle;
        }
        return qu.peek();

    }

    public static void main(String[] args) {
        int[] nums = {10,20,2,1,4,9};
        System.out.println(thirdMax(nums));
        int[] nums1 = {1,2};
        System.out.println(thirdMax(nums1));
    }
}
