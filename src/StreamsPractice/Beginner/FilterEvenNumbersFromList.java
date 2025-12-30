package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbersFromList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,15,24,46);
        List<Integer> list2 = list1.stream().filter(val -> val%2==0).toList();

        System.out.println(list2);
    }
}
