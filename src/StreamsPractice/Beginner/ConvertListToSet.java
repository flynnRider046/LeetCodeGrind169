package StreamsPractice.Beginner;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {

    public static void main(String[] args){
        List<Integer> list1 = List.of(2,3,3,2,4,5,4,3);

        Set<Integer> set1= list1.stream()
                .collect(Collectors.toSet());

        System.out.println(set1);
    }
}
