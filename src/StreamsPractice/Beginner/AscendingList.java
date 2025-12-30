package StreamsPractice.Beginner;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class AscendingList {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(4,3,23,6,5,87,5,4,3,5);

        List<Integer> list2 = list1.stream()
                .sorted().toList();

        System.out.println(list2);

    }
}
