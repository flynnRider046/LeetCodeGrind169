package GPT.ArraysAndStrings.SlidingWIndow;

import java.util.HashMap;
import java.util.Map;

public class CountAnagrams {

    public static void main(String[] args) {
        String str = "forxxorfxdofr";
        String pattern = "fox";
        int left = 0, count = 0;
        int k = pattern.length();

        Map<Character,Integer> patternMap = new HashMap<>();
        Map<Character,Integer> windowMap = new HashMap<>();
        //build pattern frequency
        for(char c : pattern.toCharArray()){
            patternMap.put(c, patternMap.getOrDefault(c,0)+1);
        }
        for(int right=0; right < str.length(); right++){
            char in = str.charAt(right);
            windowMap.put(in, windowMap.getOrDefault(in,0)+ 1);

            if(right - left + 1 == k){
                // check anagram
                if(windowMap.equals(patternMap)) {
                    count++;
                }

                //element leaves
                char out = str.charAt(left);
                windowMap.put(out, windowMap.get(out) - 1);
                if(windowMap.get(out) == 0){
                    windowMap.remove(out);
                }
                left++;
            }
        }
    }
}
