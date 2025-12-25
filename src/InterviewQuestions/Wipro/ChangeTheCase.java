package InterviewQuestions.Wipro;

public class ChangeTheCase {
    /*
    Program here is to change the case of all characters and print the output.
     */

    public static void main(String[] args) {
        String abc = "mY nAmE IS mUnEeB";
        StringBuilder strB = new StringBuilder();
        char[] abcArray = abc.toCharArray();
        for(char i : abcArray){
            if(Character.isWhitespace(i)){
                strB.append(" ");
            } else if(Character.isLowerCase(i)){
                strB.append(Character.toUpperCase(i));
            } else if(Character.isUpperCase(i)){
                strB.append(Character.toLowerCase(i));
            }
        }
        System.out.println(strB.toString());
    }
}
