package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class stringsToUpperCase {


    //Convert list of Strings to Uppercase
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rohith","damgeti","praveen");
        List<String> upperCaseList = list.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseList);
    }
}
