package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscendingListStreams {

    //program to sort list of integers in ascending order
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(100,33,22,44,1,56);
        List<Integer> ascList = list1.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(ascList);

        List<Integer> descList = list1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descList);



    }
}
