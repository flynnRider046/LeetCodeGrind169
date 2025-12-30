package StreamsPractice.Beginner;

import java.util.Arrays;
import java.util.List;

public class FirstEvenNUmberGreaterThanTen {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,6,4,22,34,87,53,23);

        Integer val = list1.stream()
                .filter(val1 -> val1 > 9 && val1%2==0).findFirst().get();

        System.out.println(val);
    }
}
