package InterviewQuestions.Wipro;

import java.util.HashMap;

public class PrintCountOfAlphabets {
    /*
    The problem is to remove the special characters, spaces and numbers
    and print the count of each alphabet
     */
    public static void main(String[] args) {
        HashMap<Character,Integer> hash1 = new HashMap<>();
        String str = "aab cx1 @ cd";
        // converting str to char[]
        char[] strArr = str.toCharArray();
        for(char i: strArr){
            if(Character.isLetter(i)){
                hash1.put(i, hash1.getOrDefault(i,0)+1);
            }
        }
        for(char ch : hash1.keySet()){
            System.out.println(ch +" "+ hash1.get(ch));
        }

    }
}
