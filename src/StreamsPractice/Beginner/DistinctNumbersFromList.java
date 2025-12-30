package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DistinctNumbersFromList {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,2,3,2,1,3,6,4,3,4,2);

        List<Integer> distinct = list1.stream()
                .distinct().toList();

        System.out.println(distinct);

     }
}
