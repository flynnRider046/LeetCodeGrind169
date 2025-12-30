package StreamsPractice.Beginner;

import java.util.List;

public class CheckingAllElementsArePositive {

    public static void main(String[] args){
        List<Integer> list1 = List.of(2,-1,3,4);

        boolean condition = list1.stream()
                .allMatch( val1 -> val1 > 0);

        System.out.println(condition);

    }
}
