package GPT.ArraysAndStrings.SlidingWIndow;

import java.util.ArrayList;

public class AverageOfSubArrays {

    public static void main(String[] args){
        ArrayList<Double> arList = new ArrayList<>();
        int[] arr1 = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k=5,left = 0;
        double sum= 0.0;
        for(int right=0; right < arr1.length; right++){
            sum += arr1[right];

            if(right - left + 1 == k){
                arList.add(sum/k);
                sum -= arr1[left];
                left++;
            }
        }
        arList.forEach(System.out::println);
    }
}
