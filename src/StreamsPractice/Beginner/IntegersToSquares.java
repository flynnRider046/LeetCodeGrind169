package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class IntegersToSquares {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(3,4,5,6);

        List<Integer> list2 = list1.stream()
                .map(val1 -> val1*val1).toList();

        System.out.println(list2);
    }
}
