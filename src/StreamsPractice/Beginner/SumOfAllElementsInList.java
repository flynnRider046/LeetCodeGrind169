package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllElementsInList {

    public static Optional<Integer> findingSum(List<Integer> list1){
        if(list1.isEmpty()){
            return Optional.empty();
        }
        return list1.stream().reduce((a,b) -> a+b);

    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(9,5,2,3,1,5);
        Optional<Integer> s = findingSum(list1);
        if(s.isEmpty()){
            System.out.println("Its an empty list and there is no sum");
        } else {
            System.out.println("The sum is "+s.get());
        }

    }
}
