package LeetCode75.ArraysStrings;

public class GcdOfStrings {

    static void findingGCD(String str1, String str2){
        String word3 = "";
        int gcd = 0;
        if(str1.contains(str2)){
            int len1 = str1.length();
            int len2 = str2.length();

            for(int i=1; i <= str2.length(); i++){
                if(len1 % i == 0 && len2 % i == 0){
                    gcd = i;
                }
            }
            word3 = str1.substring(0,gcd);
        }
        System.out.println(word3);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        findingGCD(str1, str2);
    }
}
