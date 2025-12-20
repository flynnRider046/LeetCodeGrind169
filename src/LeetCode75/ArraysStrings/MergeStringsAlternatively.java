package LeetCode75.ArraysStrings;

public class MergeStringsAlternatively {

    static void mergingStrings(String word1, String word2){
        StringBuilder str = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int max_length = Math.max(l1,l2);

        for(int i=0; i < max_length; i++){
            str.append(word1.charAt(i)).append(word2.charAt(i));

            if(i == l1 - 1){
                str.append(word2, i+1, max_length);
                break;
            } else if (i == l2 - 1){
                str.append(word1, i+1, max_length);
                break;
            }
        }
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        mergingStrings(word1, word2);
    }
}
