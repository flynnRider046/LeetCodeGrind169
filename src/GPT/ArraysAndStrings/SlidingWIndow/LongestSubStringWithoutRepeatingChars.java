package GPT.ArraysAndStrings.SlidingWIndow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args){
        String str = "abcabcbb";
        char[] strChar = str.toCharArray();
        Set<Character> set1 = new HashSet<>();
        int left = 0, max_length = 0;
        for(int right=0; right < str.length(); right++){
            while(set1.contains(strChar[right])){
                set1.remove(strChar[left]);
                left++;
            }
            set1.add(strChar[right]);
            max_length = Math.max(max_length,right-left+1);
        }
        System.out.println(max_length);
    }
}
