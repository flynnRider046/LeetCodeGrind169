package StreamsPractice.Beginner;

import java.util.*;

public class LengthofEachString {


    //length of each string from the list
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Ramani","madhav","Tony");
        List<Integer> lenList = list1.stream().map(str -> str.length()).toList();
        System.out.println(lenList);
    }
}
