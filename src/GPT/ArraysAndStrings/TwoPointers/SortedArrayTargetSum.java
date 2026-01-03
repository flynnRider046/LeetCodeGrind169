package GPT.ArraysAndStrings.TwoPointers;

public class SortedArrayTargetSum {
    /*
    Return true if there exist two numbers in the array whose sum equals the target, otherwise return false.
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6};
        int target = 6, right = 0, left = arr1.length - 1;
        System.out.println(TargetSumMethod(right, left, arr1, target));

    }

    private static boolean TargetSumMethod(int right, int left, int[] arr1, int target) {
        while(right < left){
            if(arr1[right] + arr1[left] == target){
                return true;
            } else if (arr1[right] + arr1[left] < target) {
                right++;
            } else if (arr1[right] + arr1[left] > target){
                left--;
            }
        }
        return false;
    }
}
