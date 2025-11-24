package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GetMaxAndMinValue {

    //Get the max value and min value from the list using streams.

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(100,44,32,65,22,66);
        Optional<Integer> max_value = list1.stream().max(Comparator.naturalOrder());
        System.out.println(max_value.orElse(null));

        Optional<Integer> min_value = list1.stream().min(Comparator.naturalOrder());
        System.out.println(min_value.orElse(null));
    }
}
