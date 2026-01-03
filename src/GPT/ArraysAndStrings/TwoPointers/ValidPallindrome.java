package GPT.ArraysAndStrings.TwoPointers;

public class ValidPallindrome {

    public static void main(String[] args){
        /*
        Approach 1
         */
//        String str = "A man, a pla, a canal: Panama";
//        StringBuffer strB = new StringBuffer();
//        for(int i=0; i < str.length(); i++){
//            if(Character.isLetter(str.charAt(i))){
//                strB.append(Character.toLowerCase(str.charAt(i)));
//            }
//        }
//        int right = strB.length() - 1, left = 0;
//        System.out.println(pallindromeOrNot(left, right, strB));
//    }
//
//    private static boolean pallindromeOrNot(int left, int right, StringBuffer strB) {
//        while(left < right){
//            if(strB.charAt(right) != strB.charAt(left)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

        /*
        Approach 2
         */
        String str = "A man, a plan, a canal: Panama";
        System.out.println(pallindromeOrNot(str));
    }

    private static boolean pallindromeOrNot(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            char l = str.charAt(left);
            char r = str.charAt(right);

            if(!Character.isLetterOrDigit(l)){
                left++;
            } else if (!Character.isLetterOrDigit(r)){
                right--;
            }
            else {
                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
