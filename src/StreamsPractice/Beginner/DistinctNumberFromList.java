package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class DistinctNumberFromList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(11,11,33,22,44,33,22,11);
        list1 = list1.stream().distinct().toList();

        System.out.println(list1);

    }
}
