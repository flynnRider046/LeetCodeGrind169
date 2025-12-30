package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElementsInList {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(5,4,3,2,1);

        Integer sum = list1.stream()
                .reduce((val1,val2) -> val1 + val2).get();

        System.out.println(sum);
    }
}
