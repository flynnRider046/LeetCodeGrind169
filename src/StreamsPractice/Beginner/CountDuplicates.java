package StreamsPractice.Beginner;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,3,2,3);

        Map<Integer,Long> mapFunc = numbers.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(mapFunc);
    }

}
